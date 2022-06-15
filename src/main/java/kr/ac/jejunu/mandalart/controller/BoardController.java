package kr.ac.jejunu.mandalart.controller;

import kr.ac.jejunu.mandalart.dao.BoardDao;
import kr.ac.jejunu.mandalart.model.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardDao boardDao;

    @RequestMapping(value = "save", method = {RequestMethod.POST, RequestMethod.PUT})
    public Board plan(@RequestBody Board board) {
        return boardDao.save(board);
    }

    @GetMapping("get/{id}")
    public Board get(@PathVariable Integer id) {
        return boardDao.findById(id).orElse(null);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        boardDao.delete(boardDao.findById(id).orElse(null));
    }

}
