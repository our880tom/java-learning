package cn.swiftdev.example.pattern.summary.ioc;

import cn.swiftdev.example.pattern.summary.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{userid}")
    public User getUser(@PathVariable("userid") String userId){
        return userService.getUser(userId);
    }
}
