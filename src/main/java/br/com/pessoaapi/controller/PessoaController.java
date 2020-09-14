package br.com.pessoaapi.controller;

import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.pessoaapi.model.Pessoa;
import br.com.pessoaapi.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public Page<Pessoa> paged(Pageable pageable) {
		return pessoaRepository.findAll(pageable);
	}
	
	@GetMapping("/all")
	public List<Pessoa> all() {
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pessoa save(@Valid @RequestBody Pessoa pessoa){
		pessoa.setCriadoEm(new Date());
		return pessoaRepository.save(pessoa);
	}
	
	@PutMapping("/{id}")
	public Pessoa update(@PathVariable String id, @Valid @RequestBody Pessoa pessoa) {
		Pessoa pessoaUpdate = pessoaRepository.findById(id).get();
		pessoa.setCriadoEm(pessoaUpdate.getCriadoEm());
		BeanUtils.copyProperties(pessoa, pessoaUpdate);
		pessoaUpdate.setId(id);
		pessoaUpdate.setAtualizadoEm(new Date());
		return pessoaRepository.save(pessoaUpdate);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		pessoaRepository.deleteById(id);
	}
	
}
