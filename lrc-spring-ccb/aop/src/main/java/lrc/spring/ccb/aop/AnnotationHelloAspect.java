package lrc.spring.ccb.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnotationHelloAspect {

    /**
     * 相当schemalAOP中定义了一个为helloPointcut的Pointcut
     */
    @Pointcut(value = "execution(* lrc.spring.ccb.aop.Hello.*(..)) && args(param)", argNames = "param")
    public void helloPointcut(String param) {
    }

    @Before(value = "helloPointcut(param)", argNames = "param")
    public void beforeAdvice(String param) {
        System.out.println("before advice" + param);
    }

    /**
     * value指定一个定义好的pointcut，pointcut则直接写过滤规则表达式
     * 两者同时存在时，pointcut的优先级高
     */
    @AfterReturning(
            value = "helloPointcut(retVal)",
            pointcut = "execution(* lrc.spring.ccb.aop.Hello.*(..))",
            argNames = "retVal",
            returning = "retVal"
    )
    public void afterReturningAdvice(Object retVal) {
        System.out.println("after returning advice, retVal = " + retVal);
    }

    @AfterThrowing(
            value = "execution(* lrc.spring.ccb.aop.Hello.*(..))",
            argNames = "exception",
            throwing = "exception"
    )
    public void afterThrowingAdvice(Exception exception) {
        System.out.println("after throwing advice, exception = " + exception);
    }

    @After(value = "execution(* lrc.spring.ccb.aop.Hello.*(..))")
    public void afterAdvice() {
        System.out.println("after advice");
    }

    @Around(value = "execution(* lrc.spring.ccb.aop.Hello.*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around advice before");
        joinPoint.proceed();
        System.out.println("around advice after");
    }
}
