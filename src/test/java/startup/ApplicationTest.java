package startup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mysql.Application;
import mysql.User;
import mysql.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
	@Autowired
	private UserRepository userRepository;
	//test
	@Test
	public void test() {
		
		User user1  = userRepository.findOne(13);
		System.err.println(user1.getEmail());
	}

}
