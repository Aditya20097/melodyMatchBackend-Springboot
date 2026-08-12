package com.melodymatch.repository;

import com.melodymatch.entity.User;
import com.melodymatch.entity.UserMusicPreference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMusicPreferenceRepository extends JpaRepository<UserMusicPreference,Long> {
    List<UserMusicPreference> findByUser(User user);
}
