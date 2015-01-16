package com.showcase.mvc.repository;

import com.showcase.mvc.mapper.UserMapper;
import com.showcase.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vinni on 1/15/15.
 */
@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUsers() {
        List<User> list = jdbcTemplate.query("SELECT idUser,name FROM User", new UserMapper());
        return list;
    }
}
