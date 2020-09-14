package br.com.pessoaapi.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaTest {
	
	@Mock
	Pessoa pessoa;
	
	
	@Before
	public void setup() {
	}
	
	@Test
	public void getCpfTest() {
		pessoa.getCpf();
	}
	
	@Test
	public void getNomeTest() {
		pessoa.getNome();
	}
	
	@Test
	public void getEmailTest() {
		pessoa.getEmail();
	}
	
	@Test
	public void getSexoTest() {
		pessoa.getSexo();
	}
	
	@Test
	public void getDataNascimentoTest() {
		pessoa.getDataNascimento();
	}
	
	@Test
	public void getNascionalidadeTest() {
		pessoa.getNascionalidade();
	}
	
	@Test
	public void getNaturalizadeTest() {
		pessoa.getNaturalizade();
	}
	
	@Test
	public void getCriadoEmTest() {
		pessoa.getCriadoEm();
	}
	
	@Test
	public void getEqualsTest() {
		pessoa.equals(new Pessoa());
	}
	
	@Test
	public void getToStringTest() {
		pessoa.toString();
	}
	
	

}
