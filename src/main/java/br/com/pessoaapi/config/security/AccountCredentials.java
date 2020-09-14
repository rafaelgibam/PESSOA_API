package br.com.pessoaapi.config.security;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountCredentials {
	private String username;
	private String password;
}
