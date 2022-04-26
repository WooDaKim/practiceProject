package com.example.RecordMe.Repository;

import com.example.RecordMe.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
