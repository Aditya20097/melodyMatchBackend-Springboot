package com.melodymatch.repository;

import com.melodymatch.entity.Match;
import com.melodymatch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match,Long> {
    List<Match> findByUserOneOrUserTwo(User One,User Two);
}
