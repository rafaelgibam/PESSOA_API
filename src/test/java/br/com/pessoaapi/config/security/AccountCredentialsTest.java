package br.com.pessoaapi.config.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountCredentialsTest {
	
	@Mock
	AccountCredentials accountCredentials;
	
	@Test
	public void getUsernameTest() {
		accountCredentials.getUsername();
	}
	
	@Test
	public void getPasswordTest() {
		accountCredentials.getPassword();
	}
}
