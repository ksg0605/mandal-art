package kr.ac.jejunu.mandalart.repository;

import kr.ac.jejunu.mandalart.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
