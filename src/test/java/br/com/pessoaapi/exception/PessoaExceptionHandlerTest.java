package br.com.pessoaapi.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaExceptionHandlerTest {
	
	@Autowired
	PessoaExceptionHandler pessoaExceptionHandler;
	
	@Mock
	MethodArgumentNotValidException exception;
	@Mock
	WebRequest webRequest;
	
	@Test
	public void handleNoSuchElementExceptionTest() {
		pessoaExceptionHandler.handleNoSuchElementException(Mockito.any(), Mockito.any());
	}
	

}
