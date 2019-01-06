import gclibAOP.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testProxy {
    @Test
    public void test() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        /**
         * AOP注入到IOC
         */
//        IUser iUser = (IUser)ac.getBean("proxyFactory");
//        System.out.println(iUser.getClass());
//        iUser.save();

        /**
         * 注解AOP，底层仍是动态代理
         */
//        IUser iu = (IUser)ac.getBean("annotationDao");
//        System.out.println(iu.getClass());
//        iu.save();

        /**
         * gclib AOP，OrderDao没有实现接口
         */
        OrderDao orderDao = (OrderDao)ac.getBean("orderDao");
        System.out.println(orderDao.getClass());
        orderDao.book();
        orderDao.otherAction();
    }
}
