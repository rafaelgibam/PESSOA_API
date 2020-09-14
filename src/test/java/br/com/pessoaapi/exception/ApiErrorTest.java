package br.com.pessoaapi.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiErrorTest {
	
	
	@Mock
	ApiError apiError;
	
	@Test
	public void getErrorsTest() {
		apiError.getErrors();
	}
	
	@Test
	public void getMensagensTest() {
		apiError.getMensagem();
	}
	
	@Test
	public void getStatusTest() {
		apiError.getStatus();
	}
	
	@Test
	public void apiErrorTest() {
		
	}
	
}
