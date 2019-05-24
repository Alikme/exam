package lv.tsi.exam.allUsers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityTest {

    @Test
    public void name() throws Exception{
        UserEntity user = new UserEntity(15,"bob", "Mark", "26545656", "Stars");
        assertEquals("bob", user.getName());
    }

}