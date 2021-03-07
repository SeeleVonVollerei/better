package com.Seele.personal.listener;

import com.Seele.personal.pojo.TestDTO1;
import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        TestDTO1 testDTO1 = testEvent.getTestDTO1();

        System.out.println("code"+testDTO1.getCode());
        System.out.println("name"+testDTO1.getName());
    }
}
