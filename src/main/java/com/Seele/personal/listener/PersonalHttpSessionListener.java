package com.Seele.personal.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@Component
public class PersonalHttpSessionListener implements HttpSessionListener {

    private static final Logger logger = LoggerFactory.getLogger(PersonalHttpSessionListener.class);

    public Integer count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("用户上线");
        count++;
        se.getSession().getServletContext().setAttribute("count",count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("用户下线");
        count--;
        se.getSession().getServletContext().setAttribute("count",count);
    }
}
