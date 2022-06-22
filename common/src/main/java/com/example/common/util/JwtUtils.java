package com.example.common.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Map;

/**
 * @author 21167
 */
public class JwtUtils {
    private static final String SECRET="nbdfjhaljdhfbjkdfndak";
    public static String createToken(Map map){
        String token= Jwts.builder().setClaims(map).signWith(SignatureAlgorithm.HS512,SECRET).compact();
        return token;
    }
}
