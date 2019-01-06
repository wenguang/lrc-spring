import lrc.spring.ccb.injection.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        System.out.println(context.getBean("person", Person.class).getPet().getBarking());
        System.out.println(context.getBean("person1", Person.class).getPet().getBarking());
        System.out.println(context.getBean("person2", Person.class).getPet().getBarking());
        System.out.println(context.getBean("person3", Person.class).getAge());
        System.out.println(context.getBean("person4", Person.class).getAge());
        System.out.println(context.getBean("person5", Person.class).getAge());
        System.out.println(context.getBean("person5", Person.class).getPet().getBarking());
        //System.out.println(context.getBean("person3", Person.class).getPet().getBarking());
    }
}
