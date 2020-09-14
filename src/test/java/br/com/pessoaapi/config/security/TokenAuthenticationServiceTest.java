package br.com.pessoaapi.config.security;

import static org.mockito.Mockito.when;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TokenAuthenticationServiceTest {
	
	
	@MockBean
	HttpServletResponse httpServletResponse;
	
	@MockBean
	HttpServletRequest httpServletRequest;
	
	@Test()
	public void addAuthenticationTest() throws IOException {
		when(httpServletResponse.getWriter()).thenReturn(new PrintWriter("json"));
		TokenAuthenticationService.addAuthentication(httpServletResponse, "User");
	}
	
	@Test
	public void getAuthenticationComTokenTest() {
		when(httpServletRequest.getHeader("Authorization")).thenReturn("token");
		TokenAuthenticationService.getAuthentication(httpServletRequest);
	}
	
	@Test
	public void getAuthenticationSemTokenTest() {
		TokenAuthenticationService.getAuthentication(httpServletRequest);
	}
	
	@Test
	public void getAuthenticationComUserTest() {
		when(httpServletRequest.getHeader("Authorization")).thenReturn("token");
		TokenAuthenticationService.getAuthentication(httpServletRequest);
	}
	
	
}
