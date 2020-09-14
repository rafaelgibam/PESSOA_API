package br.com.pessoaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.pessoaapi.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String> {
	
}
