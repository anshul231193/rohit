package org.krams.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDetails getUserDetailByUserName(String username) {
		User user = new User("John Nathan", "john", "test", true, true, true,
				true);
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role();
		role.setName("ROLE_USER");
		Role role1 = new Role();
		role1.setName("ROLE_ADMIN");
		roles.add(role);
		roles.add(role1);
		user.setAuthorities(roles);
		return user;
	}
}