package jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private static Object target;
    private static AOP aop;
    public static Object getProxyInstance(Object target_, final AOP aop_) {
        target = target_;
        aop = aop_;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aop.begin();
                        Object returnValue = method.invoke(target, args);
                        aop.close();
                        return returnValue;
                    }
                }
        );
    }
}
