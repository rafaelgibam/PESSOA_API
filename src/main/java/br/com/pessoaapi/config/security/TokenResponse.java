package br.com.pessoaapi.config.security;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TokenResponse {
	String type;
	String token;
	Date expire;
}
