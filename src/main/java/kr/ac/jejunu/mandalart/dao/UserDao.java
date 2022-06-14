package kr.ac.jejunu.mandalart.dao;

import kr.ac.jejunu.mandalart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
