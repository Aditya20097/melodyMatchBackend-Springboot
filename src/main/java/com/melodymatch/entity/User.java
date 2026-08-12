package com.melodymatch.entity;
import com.melodymatch.entity.enums.Gender;
import com.melodymatch.entity.enums.InterestedIn;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    private String lastname;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private LocalDate dob;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private InterestedIn interestedIn;

    @Column(length = 1000)
    private  String bio;

    private String profileImage;

    private LocalDate createdAt;

    private LocalDate updatedAt;



}
