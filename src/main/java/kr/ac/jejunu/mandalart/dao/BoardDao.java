package kr.ac.jejunu.mandalart.dao;

import kr.ac.jejunu.mandalart.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao extends JpaRepository<Board, Integer> {

}
