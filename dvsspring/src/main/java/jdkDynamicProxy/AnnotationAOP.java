package jdkDynamicProxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationAOP {
    @Before("execution(* jdkDynamicProxy.*.*(..))")
    public void begin() {
        System.out.println("开始事务");
    }
    @After("execution(* jdkDynamicProxy.*.*(..))")
    public void close() {
        System.out.println("关闭事务");
    }

}
