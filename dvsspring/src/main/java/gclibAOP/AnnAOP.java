package gclibAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnAOP {
    @Before("execution(* gclibAOP.OrderDao.book(..))")
    public void beginBook() {
        System.out.println("begin book");
    }
    @After("execution(* gclibAOP.*.*(..))")
    public void endBook() {
        System.out.println("end book");
    }
}
