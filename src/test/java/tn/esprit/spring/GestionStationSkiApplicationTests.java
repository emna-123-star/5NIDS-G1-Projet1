package tn.esprit.spring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class GestionStationSkiApplicationTests {
	@Autowired
	IUserService us;
	@Test
	@Order(1)
	public void testRetrieveAllUsers() {
		List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertEquals(0, listUsers.size());
	}
	void contextLoads() {
	}

}
