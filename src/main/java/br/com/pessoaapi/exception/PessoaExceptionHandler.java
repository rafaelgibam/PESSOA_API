package br.com.pessoaapi.exception;

import java.util.NoSuchElementException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PessoaExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler({ NoSuchElementException.class })
    public ResponseEntity<Object> handleNoSuchElementException(
      Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(
          new ApiError("Não conseguimos encontrar o id passado no path", HttpStatus.BAD_REQUEST),
          			   new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return new ResponseEntity<Object>(
		          new ApiError(ex.getMessage(), HttpStatus.BAD_REQUEST),
		          			   new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	 
	
}



