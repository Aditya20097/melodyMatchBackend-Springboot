package com.melodymatch.controller;

import com.melodymatch.dto.request.RegisterRequest;
import com.melodymatch.dto.response.RegisterResponse;
import com.melodymatch.entity.User;
import com.melodymatch.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private AuthService authService;

    @PostMapping
    public ResponseEntity<RegisterResponse> registerUser(@Valid @RequestBody RegisterRequest request) {
        RegisterResponse response =authService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
