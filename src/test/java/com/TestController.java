package com;

import com.entity.User;
import com.redis.RedisUtils;
import com.service.IUserService;
import com.utils.CreateMD5;
import com.utils.UUIDUtil;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@SpringBootTest(classes = {Test.class})
@RunWith(SpringRunner.class)
public class TestController {

    @Resource
    private RedisUtils redisUtils;

    @Autowired
    private IUserService userService;

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     *用户注册
     */
    @Test
    public void testRegistered() throws UnsupportedEncodingException {
        User user = new User();
        user.setUserName("dawei");
        HashMap<String,Object> map = new HashMap<>();
        map.put("userName" , user.getUserName());
        List<User> list = (List<User>) userService.listByMap(map);
        if(list != null && list.size() != 0){
            System.out.println(list);
            System.out.println("用户名已存在！");
        }else {
            user.setId(UUIDUtil.uuidStr());
            user.setPassWord(CreateMD5.getMd5("123456"));
            user.setCreateBy(user.getId());
            user.setCreateTime(df.format(new Date()));
            user.setLastModificationTime(df.format(new Date()));
            user.setIsDelete(0);
            user.setModificationBy(user.getId());
            user.setSortNo(1);
            user.setVersion(1);
            user.setPhone("13516541589");
            userService.save(user);
            System.out.println(user);
        }
    }

}
