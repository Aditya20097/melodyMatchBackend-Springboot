package com.melodymatch.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter

@Builder
@AllArgsConstructor
public class RegisterResponse {
    private  Long id;
    private  String email;
    private String firstName;
   private  String message;

}
