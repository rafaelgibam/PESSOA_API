package br.com.pessoaapi.exception;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class ApiError {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String mensagem;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> errors;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private HttpStatus status;
	
	public ApiError(String mensagem, HttpStatus status) {
		this.mensagem = mensagem;
		this.status = status;
	}
	
	public ApiError(String mensagem, HttpStatus status, List<String> errors) {
		this.mensagem = mensagem;
		this.status = status;
		this.errors = errors;
	}
	
	public ApiError(String mensagem, HttpStatus status, String error) {
		this.mensagem = mensagem;
		this.status = status;
		this.errors = Arrays.asList(error);
	}
}
