import com.lsp.dao.UserDao;
import com.lsp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUserById() {
        int tid = 1;
        User user = userDao.findUserById(tid);
        System.out.println(user.getTid()+":"+user.getTname());
    }
}
