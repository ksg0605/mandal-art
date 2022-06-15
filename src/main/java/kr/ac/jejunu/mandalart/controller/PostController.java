package kr.ac.jejunu.mandalart.controller;

import kr.ac.jejunu.mandalart.dao.PostDao;
import kr.ac.jejunu.mandalart.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostDao postDao;

    @GetMapping("/{id}")
    public List<Post> get(@PathVariable Integer id) {
        return postDao.findAll();
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST, RequestMethod.PUT})
    public Post subPlan(@RequestBody Post post) {
        return postDao.save(post);
    }

    @GetMapping("/{id}/{postNumber}")
    public Post getSubPlan(@PathVariable Integer id, @PathVariable Integer postNumber) {
        return postDao.findById(postNumber).orElse(null);
    }

    @DeleteMapping("/delete/{id}/{postNumber}")
    public void delete(@PathVariable Integer id, @PathVariable Integer postNumber) {
        postDao.delete(postDao.findById(postNumber).orElse(null));
    }
}
