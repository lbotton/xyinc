package br.com.botton.xyinc.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.botton.xyinc.entity.PontoInteresse;

public class PontoInteresseRESTControllerTest {
	
	private String EXPECTED_RESPONSE = "[{\"id\":1,\"nome\":\"Lanchonete\",\"x\":27,\"y\":12},{\"id\":3,\"nome\":\"Joalheria\",\"x\":15,\"y\":12},{\"id\":5,\"nome\":\"Pub\",\"x\":12,\"y\":8},{\"id\":6,\"nome\":\"Supermercado\",\"x\":23,\"y\":6},{\"id\":7,\"nome\":\"Churrascaria\",\"x\":28,\"y\":12}][{\"id\":1,\"nome\":\"Lanchonete\",\"x\":27,\"y\":12},{\"id\":3,\"nome\":\"Joalheria\",\"x\":15,\"y\":12},{\"id\":5,\"nome\":\"Pub\",\"x\":12,\"y\":8},{\"id\":6,\"nome\":\"Supermercado\",\"x\":23,\"y\":6},{\"id\":7,\"nome\":\"Churrascaria\",\"x\":28,\"y\":12}]";

	@Test
	void test() {
		PontoInteresseRESTController p = new PontoInteresseRESTController();
		List<PontoInteresse> response = p.find(Long.valueOf(20), Long.valueOf(10), Double.valueOf(10.0));
		assertFalse(response.isEmpty());
	}
	
}
