package com.example.relationships;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.relationships.onetoone.Gender;
import com.example.relationships.onetoone.User;
import com.example.relationships.onetoone.UserProfile;
import com.example.relationships.onetoone.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipsApplicationTests {

	/*
	 * @Test public void contextLoads() { }
	 */

	@Autowired
	private UserRepository userRepository;
	
	
	@Test
	public void createUser()
	{
		User user = new User(null, "anand@khot.com", new UserProfile(null, "anand", Gender.MALE), "anand");
		userRepository.save(user);
		
		List<Integer> list = userRepository.listids();
		Iterator<Integer> iterator = list.iterator();
		
		
		while(iterator.hasNext())
		{
			System.out.println("Print Users: " + iterator.next());
		}
		
		
		userRepository.deleteById(7l);
		
	}
	
	
}
