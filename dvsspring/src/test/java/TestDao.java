import dao.JdbcTemplateDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        JdbcTemplateDao jdbcTemplateDao = (JdbcTemplateDao)ac.getBean("mjDao");
//        mjDao.update();
        jdbcTemplateDao.query();

//        OriginDao odao = new OriginDao();
//        odao.originTest();
    }
}
