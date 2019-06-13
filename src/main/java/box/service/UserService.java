package box.service;

import box.pojo.User;

public interface UserService {
    void login(String name, String password);
    void register(User user);
}
