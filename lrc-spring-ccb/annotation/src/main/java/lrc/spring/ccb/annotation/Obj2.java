package lrc.spring.ccb.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:cars.properties")
public class Obj2 {
    /**
     * 用@PropertySource引入某个属性文件，用$来获取其值
     * 总不成功，输出为：${car.me}
     */
    @Value("${car.me}")
    private String meCar;

    public String getMeCar() {
        return meCar;
    }
}
