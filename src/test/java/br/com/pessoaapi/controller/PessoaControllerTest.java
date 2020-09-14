package br.com.pessoaapi.controller;

import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import br.com.pessoaapi.model.Pessoa;
import br.com.pessoaapi.repository.PessoaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PessoaControllerTest {
	
	@Autowired
	PessoaController pessoaController;
	
	@MockBean
	PessoaRepository pessoaRepository;
	
	@Before
	public void setUp() {
		Optional<Pessoa> pessoaOp = Optional.of(new Pessoa());
		BDDMockito.when(pessoaRepository.save(Mockito.any())).thenReturn(new Pessoa());
		BDDMockito.when(pessoaRepository.findById(Mockito.any())).thenReturn(pessoaOp);
	}
	
	@Test
	public void pagedTest() {
		pessoaController.paged(Mockito.any());
	}
	
	@Test
	public void allTest() {
		pessoaController.all();
	}
	
	@Test
	public void saveTest() {
		pessoaController.save(new Pessoa());
	}
	
	@Test
	public void updateTest() {
		pessoaController.update(Mockito.anyString(), new Pessoa());
	}
	
	@Test
	public void deleteTest() {
		pessoaController.delete(Mockito.anyString());
	}
	
}
