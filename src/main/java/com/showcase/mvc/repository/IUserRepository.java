package com.showcase.mvc.repository;

import com.showcase.mvc.model.User;

import java.util.List;

/**
 * Created by vinni on 1/15/15.
 */
public interface IUserRepository {
    List<User> getUsers();

}
