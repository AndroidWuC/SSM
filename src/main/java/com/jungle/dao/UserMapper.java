package com.jungle.dao;

import com.jungle.entity.User;

public interface UserMapper {
	User findUserById(int id);
}
