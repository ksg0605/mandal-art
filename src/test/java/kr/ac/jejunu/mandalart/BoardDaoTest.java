//package kr.ac.jejunu.mandalart;
//
//import kr.ac.jejunu.mandalart.model.Board;
//import org.junit.jupiter.api.Test;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//
//public class BoardDaoTest {
//    private static BoardDao boardDao;
//
//    @Test
//    public void findById() {
//        Integer id = 1;
//        String purpose = "목표 달성";
//
//        Board board = boardDao.findById(id);
//
//        assertThat(board.getId(), is(id));
//        assertThat(board.getPurpose(), is(purpose));
//    }
//
//    @Test
//    public void registration() {
//        String purpose = "목표 설정";
//
//        Board board = new Board();
//        board.setPurpose(purpose);
//        boardDao.registration(board);
//
//        assertThat(board.getId(), greaterThan(0));
//
//        Board registeredBoard = boardDao.findById(board.getId());
//        assertThat(registeredBoard.getPurpose(), is(board.getPurpose()));
//    }
//
//    @Test
//    public void update() {
//        Board board = new Board();
//        board.setId(1);
//        board.setPurpose("목표 달성");
//        boardDao.registration(board);
//
//        Integer updatedId = 2;
//        String updatedPurpose = "목표 수정";
//
//        board.setId(updatedId);
//        board.setPurpose(updatedPurpose);
//
//        boardDao.update(board);
//        Board updatedBoard = boardDao.findById(board.getId());
//
//        assertThat(updatedBoard.getId(), is(board.getId()));
//        assertThat(updatedBoard.getPurpose(), is(board.getPurpose()));
//    }
//
//    @Test
//    public void delete() {
//        Board board = new Board();
//        board.setId(1);
//        board.setPurpose("목표 삭제");
//        boardDao.registration(board);
//        boardDao.delete(board.getId());
//
//        Board deletedBoard = boardDao.findById(board.getId());
//        assertThat(deletedBoard, nullValue());
//    }
//}
