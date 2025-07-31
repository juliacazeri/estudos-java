package Aula15.Exemplo02.security;

/*
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.SecurityException;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.Key;
import java.util.List;
import java.util.stream.Collectors;

public class JWTCreator{
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";

    public static String create(String prefix, String keyBase64, JWTObject jwtObject){
        Key signingKey = getSigningKey(keyBase64);

        String token = Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .setIssuedAt(jwtObject.getIssuedAt())
                .setExpiration(jwtObject.getExpiration())
                .claim(ROLES_AUTHORITIES, normalizeRoles(jwtObject.getRoles()))
                .signWith(signingKey, SignatureAlgorithm.HS512)
                .compact();

        return prefix + " " + token;
    }

    public static JWTObject create(String token, String prefix, String keyBase64)
            throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SecurityException{
        JWTObject object = new JWTObject();

        String expectedPrefix = prefix.trim() + " ";
        if(token.startsWith(expectedPrefix)){
            token = token.substring(expectedPrefix.length());
        } else if(token.startsWith(prefix)){
            token = token.substring(prefix.length());
        }

        Key signingKey = getSigningKey(keyBase64);

        Jws<Claims> jws = Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build()
                .parseClaimsJws(token);

        Claims claims = jws.getBody();

        object.setSubject(claims.getSubject());
        object.setExpiration(claims.getExpiration());
        object.setIssuedAt(claims.getIssuedAt());

        Object roles = claims.get(ROLES_AUTHORITIES);
        if(roles instanceof List<?>){
            object.setRoles((List<String>) roles);
        }

        return object;
    }

    private static List<String> normalizeRoles(List<String> roles){
        return roles.stream()
                .map(s -> "ROLE_".concat(s.replaceAll("ROLE_", "")))
                .collect(Collectors.toList());
    }

    private static Key getSigningKey(String keyBase64){
        byte[] keyBytes = Decoders.BASE64.decode(keyBase64);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
 */