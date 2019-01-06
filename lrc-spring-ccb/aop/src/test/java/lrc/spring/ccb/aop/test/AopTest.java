package lrc.spring.ccb.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void aopTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop.xml");
        ac.getBean("hello", lrc.spring.ccb.aop.Hello.class).sayHello();
    }

    @Test
    public void annotationAopTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:annotationAop.xml");
        ac.getBean("hello", lrc.spring.ccb.aop.Hello.class).sayHello();
    }
}
