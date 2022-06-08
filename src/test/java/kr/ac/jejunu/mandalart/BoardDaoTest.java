package kr.ac.jejunu.mandalart;

import org.junit.jupiter.api.Test;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BoardDaoTest {
    @Test
    public void registration() {
        Integer id = 1;
        String purpose = "목표 설정";

        BoardDao boardDao = new BoardDao();
        Board board = boardDao.registration();

        assertThat(board.setId(), is(id));
        assertThat(board.setPurpose(), is(purpose));
    }
}
