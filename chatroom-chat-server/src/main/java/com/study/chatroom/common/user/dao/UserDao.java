package com.study.chatroom.common.user.dao;

import com.study.chatroom.common.user.domain.entity.User;
import com.study.chatroom.common.user.mapper.UserMapper;
import com.study.chatroom.common.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author <a href="https://github.com/tengsk233">study</a>
 * @since 2024-09-08
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, User> implements IUserService {

}
