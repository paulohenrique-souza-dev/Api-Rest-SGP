package com.apirest.ApiRest.controllers;

import com.apirest.ApiRest.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    // DTO  login e senha
    public static class AuthRequest {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
    }

    // Endpoint de login gera o jwt
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {

        // Por enquanto, so gera token adc futuramente !!
        String token = jwtUtil.generateToken(request.getUsername());
        return ResponseEntity.ok(token);
    }
}
