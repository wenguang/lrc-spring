package lrc.spring.ccb.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import java.net.URL;

/**
 * Spring @Value 属性注入使用总结一
 * 分为：不通过properties文件的注入属性的情况
 *      通过properties文件的注入属性的情况
 * https://blog.csdn.net/hry2015/article/details/72353994
 *
 * Spring-@value用法详解
 * https://blog.csdn.net/u010832551/article/details/73826914
 */

@PropertySource("classpath:cars.properties")
public class Obj {

    /** ----- 以下为不能过properties文件注入的情况 ----- */

    /**
     * 注入普通字符串
     */
    @Value("normal")
    private String normal;
    /**
     * 注入操作系统属性，以#开头的就是spEL表达式
     */
    @Value("#{systemProperties['os.name']}")
    private String systemPropertiesName;
    /**
     * 注入表达式结果
     */
    @Value("#{T(java.lang.Math).random()}")
    private double randomNumber;
    /**
     * 注入其他bean属性
     */
    @Value("#{car.brand}")
    private String fromAnotherBean;
    /**
     * 注入文件
     */
    @Value("classpath:annotation.xml")
    private Resource resource;
    /**
     * 注入URL资源
     */
    @Value("https://www.baidu.com")
    private Resource urlResource;


    /** ----- 以下为不能过properties文件注入的情况 ----- */

    @Value("#{valueProperties['brand']}")
    private String propertiesStr;

    /**
     * 也可以用@PropertySource引入某个属性文件，用$来获取其值
     */
    @Value("${car.me}")
    private String meCar;

    /**
     * #{…} 用于执行SpEl表达式，并将内容赋值给属性
     * ${…} 主要用于加载外部属性文件中的值
     * #{…} 和${…} 可以混合使用，但是必须#{}外面，${}在里面
     */




    /** ----- getter ----- */

    public String getNormal() {
        return normal;
    }

    public String getSystemPropertiesName() {
        return systemPropertiesName;
    }

    public double getRandomNumber() {
        return randomNumber;
    }

    public String getFromAnotherBean() {
        return fromAnotherBean;
    }

    public Resource getResource() {
        return resource;
    }

    public Resource getUrlResource() {
        return urlResource;
    }

    public String getPropertiesStr() {
        return propertiesStr;
    }

    public String getMeCar() {
        return meCar;
    }
}
