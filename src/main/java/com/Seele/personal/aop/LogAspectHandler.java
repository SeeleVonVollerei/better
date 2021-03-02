package com.Seele.personal.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LogAspectHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //定义一个切面，拦截com.Seele.personal.controller包下的所有方法
    @Pointcut("execution(* com.Seele.personal.controller..*.*(..))")
    public void pointCut(){}

    //annotation() 方式是针对某个注解来定义切面，比如我们对具有@GetMapping注解的方法做切面，可以如下定义切面：
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void annotationCut() {}

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("====doBefore方法进入了====");

        // 获取签名
        Signature signature = joinPoint.getSignature();

        // 获取切入的包名
        String declaringTypeName = signature.getDeclaringTypeName();

        // 获取即将执行的方法名
        String funcName = signature.getName();

        logger.info("即将执行的方法为：{}，属于{}包",funcName,declaringTypeName);

        // 也可以用来记录一些信息，比如获取请求的url和ip
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        // 获取请求url
        String url = request.getRequestURL().toString();
        //获取请求IP
        String ip = request.getRemoteAddr();

        logger.info("用户请求的url为：{}，ip地址为：{}", url, ip);

    }

    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint){

        logger.info("====doAfter方法进入了====");
        Signature signature = joinPoint.getSignature();
        String method = signature.getName();
        logger.info("方法{}已经执行完毕",method);
    }

}
