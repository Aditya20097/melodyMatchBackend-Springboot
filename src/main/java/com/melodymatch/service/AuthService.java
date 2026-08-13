package com.melodymatch.service;

import com.melodymatch.dto.request.RegisterRequest;
import com.melodymatch.dto.response.RegisterResponse;
import com.melodymatch.entity.User;
import com.melodymatch.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public RegisterResponse register(RegisterRequest request){
         User user  =User.builder()
                 .firstname(request.getFirstName())
                 .lastname(request.getLastName())
                 .email(request.getEmail())
                 .password(passwordEncoder.encode(request.getPassword()))
                 .build();
         User savedUser = userRepository.save(user);
         return RegisterResponse.builder()
                 .id(savedUser.getId())
                 .firstName(savedUser.getFirstname())
                 .email(savedUser.getEmail())
                 .message("User registered successfully").build();

    }

}
