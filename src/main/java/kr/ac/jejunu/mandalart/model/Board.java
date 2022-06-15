package kr.ac.jejunu.mandalart.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity(name = "boards")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String purpose;

    @OneToMany(mappedBy = "board")
    private Collection<Post> board;

    public Collection<Post> getBoard() {
        return board;
    }

    public void setBoard(Collection<Post> board) {
        this.board = board;
    }
}
