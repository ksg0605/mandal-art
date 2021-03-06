package kr.ac.jejunu.mandalart.dao;

import kr.ac.jejunu.mandalart.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends JpaRepository<Post, Integer> {
}
