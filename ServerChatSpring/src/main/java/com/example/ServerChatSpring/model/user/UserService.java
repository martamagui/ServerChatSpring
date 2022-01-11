package com.example.ServerChatSpring.model.user;

import com.example.ServerChatSpring.model.msg.Msg;
import com.example.ServerChatSpring.model.msg.MsgRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        if (userRepository.findUserById(user.getUserId()).isPresent()){
            throw new IllegalStateException("This user already exists. BorpaSpim");
        }else {
            userRepository.save(user);
        }
    }
}
