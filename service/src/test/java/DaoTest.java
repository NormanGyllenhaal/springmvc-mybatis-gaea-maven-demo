import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import site.lovecode.service.entity.User;
import site.lovecode.service.mapper.UserMapper;

import java.util.List;

/**
 * Created by admin on 2016/6/24.
 */
public class DaoTest {


    //@Test
    public void userTest(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath*:applicationContext-*.xml");
        UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
        List<User> list = userMapper.selectAll();
        System.out.println(list);
    }
}
