package com.melodymatch.repository;

import com.melodymatch.entity.User;
import com.melodymatch.entity.UserLike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLikeRepository extends JpaRepository<UserLike,Long> {
    Optional<UserLike> findBySenderAndReceiver(User sender, User receiver);

    boolean existsBySenderAndReceiver(User sender, User receiver);
}
