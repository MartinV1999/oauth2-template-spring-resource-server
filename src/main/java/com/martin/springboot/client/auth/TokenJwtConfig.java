package com.martin.springboot.client.auth;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

public class TokenJwtConfig {
  public final static Key SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.RS256);
  public final static String PREFIX_TOKEN = "Bearer ";
  public final static String HEADER_AUTHORIZATION = "Authorization";
}
