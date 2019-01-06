import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.JuiceMaker;
import pojo.Source;
import service.ProductService;

public class TestSpring {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Source source = (Source)context.getBean("source");
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        JuiceMaker juiceMaker = (JuiceMaker)context.getBean("juiceMaker");
        System.out.println(juiceMaker.makeJuice());

        ProductService productService = (ProductService)context.getBean("productService");
        productService.doSomeService();
    }
}
