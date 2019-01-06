package lrc.spring.ccb.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloAspect {
    public void beforeAdvice() {
        System.out.println("before advice");
    }

    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around advice before");
        joinPoint.proceed();
        System.out.println("around advice after");
    }
    public void afterReturningAdvice(Object retVal) {
        System.out.println("after returning, retVal = " + retVal);
    }
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("after throwing exception = " + ex);
    }
    public void afterFinallyAdvice() {
        System.out.println("after finally advice");
    }
}
