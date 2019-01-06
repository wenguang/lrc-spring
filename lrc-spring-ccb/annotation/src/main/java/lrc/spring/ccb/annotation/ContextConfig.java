package lrc.spring.ccb.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 这里就相当一个xml配置，其中的方法名称就是Bean的id
 * 我们用config.xml配置了一个ContextConfig的Bean就可以用
 * 也可以@Configure注解为一个配置类，这样就可以不用config.xml再配置一下了
 * 而是用AnnotationConfigApplicationContext类即可
 *
 * 参考：零配置 之 12.4 基于Java类定义Bean配置元数据 ——跟我学spring3
 * http://jinnianshilongnian.iteye.com/blog/1463704
 */
@Configuration
public class ContextConfig {

    @Bean
    public String myCarBrand() {
        return "Suziki";
    }

    @Bean
    public Car myCar() {
        Car car = new Car();
        car.setBrand(myCarBrand());
        return car;
    }

    @Bean
    @Scope("singleton")
    /**
     * Spring中的scope配置和@scope注解
     * https://blog.csdn.net/Tracycater/article/details/54019223
     */
    public Car limitedCar() {
        Car car = new Car();
        car.setBrand("Limited Jimny");
        return car;
    }
}
