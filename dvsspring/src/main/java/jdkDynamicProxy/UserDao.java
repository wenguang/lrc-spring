package jdkDynamicProxy;

import org.springframework.stereotype.Component;

/**
 * 如果这里加了@Component，且在applicationContext.xml中配置了<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
 * AOP中的begin和close会被执行多次，原因未续...
 */
//@Component
public class UserDao implements IUser {
    public void save() {
        System.out.println("db save");
    }
}
