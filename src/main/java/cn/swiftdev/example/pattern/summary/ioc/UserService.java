package cn.swiftdev.example.pattern.summary.ioc;

import cn.swiftdev.example.pattern.summary.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(String userId){
        User user = new User();
        user.setUserId(userId);
        user.setName("liang");
        return user;

    }
}
