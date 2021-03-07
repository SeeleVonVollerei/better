package com.Seele.personal.listener;

import com.Seele.personal.pojo.TestDTO1;
import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

    private TestDTO1 testDTO1;

    public TestEvent(Object source,TestDTO1 testDTO1){
        super(source);
        this.testDTO1 = testDTO1;
    }

    public TestDTO1 getTestDTO1() {
        return testDTO1;
    }

    public void setTestDTO1(TestDTO1 testDTO1) {
        this.testDTO1 = testDTO1;
    }
}
