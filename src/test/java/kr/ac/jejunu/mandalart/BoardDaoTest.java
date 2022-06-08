package kr.ac.jejunu.mandalart;

import kr.ac.jejunu.mandalart.dao.BoardDao;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class BoardDaoTest {
    private static BoardDao boardDao;

    @Test
    public void findById() {
        Integer id = 1;
        String purpose = "목표 달성";

        Board board = boardDao.findById(id);

        assertThat(board.getId(), is(id));
        assertThat(board.getPurpose(), is(purpose));
    }

    @Test
    public void registration() {
        String purpose = "목표 설정";

        Board board = new Board();
        board.setPurpose(purpose);
        boardDao.registration(board);

        assertThat(board.getId(), greaterThan(0));

        Board registeredBoard = boardDao.findById(board.getId());
        assertThat(registeredBoard.getPurpose(), is(board.getPurpose()));
    }
}
