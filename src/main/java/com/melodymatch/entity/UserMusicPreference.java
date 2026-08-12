package com.melodymatch.entity;

import com.melodymatch.entity.enums.PreferenceType;
import jakarta.persistence.*;

public class UserMusicPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PreferenceType type;

    @Column(nullable = false)
    private String externalId;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false , name ="user_id")
    private User user;



}
