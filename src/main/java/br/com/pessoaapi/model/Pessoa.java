package br.com.pessoaapi.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "PESSOA",
	   uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "cpf")
})
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@NotNull(message = "O campo nome é obrigatório e não pode está null")
	@NotEmpty(message = "O campo nome é obrigatório e não pode está vazio.")
	private String nome; // Obrigatório
	
	private char sexo;
	
//	@NotNull(message = "O campo email é obrigatório e não pode está null")
	@NotEmpty(message = "O campo email é obrigatório e não pode está vazio.")
	@Email(message = "E-mail inválido adicione um e-mail válido.")
	private String email; // Obrigatório dever ser válido
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull(message = "O campo data nascimento é obrigatório e não pode está null")
	@JsonFormat(pattern = "dd/MM/yyyy", shape = Shape.STRING)
	private Date dataNascimento; // Obrigatório deve ser valida
	
	private String naturalizade;
	
	private String nascionalidade;
	
//	@NotNull(message = "O campo CPF é obrigatório e não pode está null")
	@NotEmpty(message = "O campo CPF é obrigatório e não pode está vazio.")
	@CPF(message = "CPF inválido adicione um CPF válido.")
	private String cpf; // Obrigatório / Formato 000.000.000-00 / Unique
	
	private Date criadoEm;
	
	private Date atualizadoEm;
	
}
