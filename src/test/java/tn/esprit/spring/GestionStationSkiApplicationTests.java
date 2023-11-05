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
public class GestionStationSkiApplicationTests {
	@Autowired
	private MonService monService;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testMethodeDeService() {
		// Écrivez votre test ici
		String resultat = monService.maMethode();
		assertEquals("Résultat attendu", resultat);
	}
	void contextLoads() {
	}

}
