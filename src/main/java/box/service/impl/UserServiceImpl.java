package box.service.impl;

import box.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import box.pojo.User;
import box.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void login(String name, String password) {
        userMapper.login(name, password);
    }
    public void register(User user) {
        userMapper.register(user);
    }
}
