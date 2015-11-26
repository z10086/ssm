package test;
import com.z.test.pojo.User;
import com.z.test.service.IUserService;
import com.z.test.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {


    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //UserServiceImpl a = new UserServiceImpl();
        IUserService a = (UserServiceImpl)context.getBean("userService");
        User b = a.getUserById(1);
        System.out.println(b.getUsername());
    }
}
