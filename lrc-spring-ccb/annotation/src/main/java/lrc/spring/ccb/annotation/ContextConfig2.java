package lrc.spring.ccb.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(ContextConfig.class)
@ImportResource("classpath:importResource.xml")
/**
 * Import引入一个配置类
 * ImportResource可导入另一个xml配置
 */
public class ContextConfig2 {

    /**
     * importResource.xml中用<context:property-placeholder location="cars.properties"/>对应了一个资源文件
     * 这里又引入了importResource.xml，故这里可用@Value引用资源文件中的值了
     * 参考：https://blog.csdn.net/qq_36206746/article/details/78136023
     */
    @Value("${gem.brands}")
    private String gemBrands;

    /**
     * 这里把getter方法定义为一个String类型的Bean
     */
    @Bean
    public String getGemBrands() {
        return gemBrands;
    }
}
