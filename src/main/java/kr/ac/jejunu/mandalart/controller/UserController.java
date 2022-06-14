package kr.ac.jejunu.mandalart.controller;

import kr.ac.jejunu.mandalart.dao.UserDao;
import kr.ac.jejunu.mandalart.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserDao userDao;

    @GetMapping("/list")
    public List<User> list() {
        return userDao.findAll();
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST, RequestMethod.PUT})
    public User add(@RequestBody User user) {
        return userDao.save(user);
    }

    @GetMapping("get/{id}")
    public User get(@PathVariable Integer id) {
        return userDao.findById(id).orElse(null);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        userDao.delete(userDao.findById(id).orElse(null));
    }
}
