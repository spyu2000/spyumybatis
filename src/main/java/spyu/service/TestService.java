package spyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spyu.dao.IUser;
import spyu.mode.User;
@Service
public class TestService {
	@Autowired
	private IUser iUser;
	@Autowired
	private User user;
	public void inserUser(){
		System.out.println("insert start");
		user.setName("test");
		iUser.insertUser(user);
		System.out.println("insert end");
	}
}
