
//spring-aop组件详解——Pointcut切点
https://my.oschina.net/lixin91/blog/686660
//AOP 之 6.2 AOP的HelloWorld ——跟我学spring3
http://jinnianshilongnian.iteye.com/blog/1418597
//AOP 之 6.3 基于Schema的AOP ——跟我学spring3
http://jinnianshilongnian.iteye.com/blog/1418598


AOP需要的包：
spring-aop（包含在spring-context中）、aopalliance、aspectjweaver、cglib，它们的关系有待研究



Pointcut（切点）是面向切面编程中的一个非常重要的概念，此概念由spring框架定义。
Pointcut的唯一作用就是筛选要拦截的目标方法，因此，有很多人会把Pointcut直接理解成——要拦截的方法，其实不然，Pointcut只是一种筛选规则（或者叫过滤器）。
Pointcut由ClassFilter（类过滤器）和MethodMatcher（方法匹配器）两个组件组成。
ClassFilter检查当前筛选规则与目标类是否匹配，MethodMatcher检查当前筛选规则与目标方法是否匹配。
两个组件的共同作用，可以筛选出一个符合既定规则的方法的集合。通过Advisor（通知器）和Advice（通知）和Pointcut（切点）组合起来，就可以把指定的通知应用到指定的方法集合上。