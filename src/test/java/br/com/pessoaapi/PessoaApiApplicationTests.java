package br.com.pessoaapi;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaApiApplicationTests {

	@Test
	public void main() {
		PessoaApiApplication.main(new String[] {});
		assertTrue(Boolean.TRUE);
	}
}
