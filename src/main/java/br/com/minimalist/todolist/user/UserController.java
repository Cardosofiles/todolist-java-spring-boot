package br.com.minimalist.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")

public class UserController {
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.getUsername());
  }
}
/**
 * String - text
 * Integer - number wholeclear
 * Double - numbers with decimal places
 * Float - numbers with decimal places
 * Char - characters special
 * Date - work with dates
 * void - 
 */