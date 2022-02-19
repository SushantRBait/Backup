package com.sushant.main.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sushant.main.VO.Department;
import com.sushant.main.VO.ResponseTempleteVO;
import com.sushant.main.model.User;
import com.sushant.main.repository.UserRepository;


@Service
public class UserServices {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RestTemplate restTemplete;
	
	public List<User> listAll() {
		return repo.findAll();
	}

	public void save(User user) {
		repo.save(user);
	}


	public ResponseTempleteVO getUserWithDepartment(Integer userId) {
		ResponseTempleteVO vo=new ResponseTempleteVO();
		User user= repo.findByUserId(userId);
		Department department=restTemplete.getForObject("http://Department-Service/user/get/"+user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
				
		return vo;
	}


	
}
