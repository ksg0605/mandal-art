package kr.ac.jejunu.mandalart.repository;

import kr.ac.jejunu.mandalart.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
