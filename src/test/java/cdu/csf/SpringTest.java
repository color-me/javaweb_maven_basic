package cdu.csf;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {
    @Test
    public void testSpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest=(SpringTest) applicationContext.getBean("springTest");
        springTest.hello();
    }
    public void hello(){
        System.out.println("hello cdu");
    }
}
