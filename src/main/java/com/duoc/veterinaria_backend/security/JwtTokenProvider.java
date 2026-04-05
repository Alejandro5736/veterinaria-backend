package com.duoc.veterinaria_backend.security;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtTokenProvider {

    private final String JWT_SECRET = "TuPalabraSecretaMuyLargaParaSeguridad123";
    private final long JWT_EXPIRATION = 604800000L; // 7 días

    // Generar el token
    public String generarToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION))
                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                .compact();
    }

    // Validar el token que viene del cliente
    public boolean validarToken(String token) {
        try {
            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}