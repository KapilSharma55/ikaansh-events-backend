package com.Ikaansh.events.repository;
import com.Ikaansh.events.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long>{
Optional<User> findByEmail(String email);
}
