package startup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import model.Application;
import model.User;
import model.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() {
		
		User user1  = userRepository.findOne(13);
		System.err.println(user1.getEmail());
	}

}
