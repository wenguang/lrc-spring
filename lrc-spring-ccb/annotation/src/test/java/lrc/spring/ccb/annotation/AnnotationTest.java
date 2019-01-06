package lrc.spring.ccb.annotation;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AnnotationTest {
    @Test
    public void testRequired() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:annotation.xml");
        Result result = (Result)ac.getBean("result");
        Assert.assertEquals("hello", result.getMessage());
    }

    @Test
    public void testAutowired() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:annotation.xml");
        Moo moo = (Moo)ac.getBean("moo");
        System.out.println(moo);
    }

    @Test
    public void testValue() throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:annotation.xml");
        Obj obj = (Obj)ac.getBean("obj");
        System.out.println(obj.getNormal());
        System.out.println(obj.getSystemPropertiesName());
        System.out.println(obj.getRandomNumber());
        System.out.println(obj.getFromAnotherBean());
        // 内容太长，注释掉
        //System.out.println(IOUtils.toString(obj.getResource().getInputStream()));
        //System.out.println(IOUtils.toString(obj.getUrlResource().getInputStream()));
        System.out.println(obj.getPropertiesStr());
        System.out.println(obj.getMeCar());

        //Obj2 obj2 = (Obj2)ac.getBean("obj2");
        //System.out.println(obj2.getMeCar());
    }

    @Test
    public void testAnnotationConfig() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(ContextConfig.class);
        System.out.println(ac.getBean("myCarBrand"));
        System.out.println(ac.getBean("myCar", Car.class).getBrand());
        System.out.println(ac.getBean("limitedCar", Car.class).getBrand());
    }

    @Test
    public void testImportResource() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ContextConfig2.class);
        System.out.println(ac.getBean("getGemBrands"));
    }
}
