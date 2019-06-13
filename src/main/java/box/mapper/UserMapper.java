package box.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import box.pojo.User;

@Repository
public interface UserMapper {
    //登录
    int login(@Param("user_name") String user_name, @Param("user_password") String password);
    //注册
    int register(@Param("user") User user);
}
