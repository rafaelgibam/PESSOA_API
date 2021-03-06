package br.com.pessoaapi.config.security;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthenticationService {
	
		// EXPIRATION_TIME = 10 dias
		static final long EXPIRATION_TIME = 860_000_000;
		static final String SECRET = "pessoa";
		static final String TOKEN_PREFIX = "Bearer";
		static final String HEADER_STRING = "Authorization";
		
	
		public static void addAuthentication(HttpServletResponse response, String username) throws IOException {
			String JWT = Jwts.builder()
					.setSubject(username)
					.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
					.signWith(SignatureAlgorithm.HS512, SECRET)
					.compact();
			
			TokenResponse tokenResponse = TokenResponse.builder().token(JWT)
																 .expire(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
																 .type(TOKEN_PREFIX)
																 .build();
			
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(tokenResponse);
			
			response.getWriter().write(json);
			response.getWriter().flush();
			response.getWriter().close();
		}
		
		public static Authentication getAuthentication(HttpServletRequest request) {
			String token = request.getHeader(HEADER_STRING);
			
			if (token != null) {
					return new UsernamePasswordAuthenticationToken("admin", null, Collections.emptyList());
			}
			return null;
		}
}
