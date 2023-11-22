package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceimpl implements userService{

    List<User> list=List.of(
            new User(1311L,"Moiz Khan","6544484"),
            new User(1321L,"Arshad Khan","65494484"),
            new User(1324L,"Akhil Khan","65497884")
    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
