package site.lovecode.service.service.impl;

import com.bj58.spat.gaea.server.contract.annotation.ServiceBehavior;
import site.lovecode.service.entity.User;
import site.lovecode.service.mapper.UserMapper;
import site.lovecode.service.service.IUserService;

import javax.annotation.Resource;

/**
 * Created by admin on 2016/6/24.
 */
@ServiceBehavior
public class UserServiceImpl implements IUserService{


    @Resource
    private UserMapper userMapper;


    public User getOneUser(Integer id) {
        return userMapper.selectByPrimaryKey(1);
    }

}
