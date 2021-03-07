package com.Seele.personal.listener;

import com.Seele.personal.pojo.TestDTO1;
import com.Seele.personal.service.crudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

@Component
public class ServletContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //先获取application上下文
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();

        //获取对应的service
        crudService crudService = applicationContext.getBean(crudService.class);
        List<TestDTO1> testList = crudService.test1();
        TestDTO1 testDTO1 = testList.get(0);

        // 获取application域对象，将查到的信息放到application域中
        ServletContext application = applicationContext.getBean(ServletContext.class);
        application.setAttribute("testDTO1",testDTO1);
    }
}
