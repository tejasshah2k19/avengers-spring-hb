package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.AddressRepository;
import com.dao.EmployeeRepository;
import com.entity.AddressEntity;
import com.entity.EmployeeEntity;

@Controller
public class OneToOneController {

	@Autowired
	EmployeeRepository empRepo;

	@Autowired
	AddressRepository addRepo;

	@GetMapping("/loginemp")
	public String loginEmp() {
		return "LoginEmp";
	}

	@PostMapping("/loginemp")
	public String loginEmpAuthneticate(EmployeeEntity empEntity, HttpSession session) {
		// ram
		empEntity = empRepo.findByName(empEntity.getName());
		System.out.println(empEntity);

		if (empEntity == null) {
			return "LoginEmp";
		} else {
			session.setAttribute("emp", empEntity);// id name
			System.out.println(empEntity.getAddress());
			return "Home";

		}
	}

	@PostMapping("/saveaddress")
	public String saveAddress(AddressEntity address, HttpSession session) {

		addRepo.save(address);//address save 
		EmployeeEntity emp = (EmployeeEntity) session.getAttribute("emp");
		emp.setAddress(address);
		empRepo.save(emp); //update addressId set 
		
		
		
		return "Home";
	}

	@GetMapping("/newemp")
	public String newEmp() {
		return "NewEmp";
	}

	@PostMapping("/saveemp")
	public String saveEmp(EmployeeEntity empEntity) {

		empRepo.save(empEntity);
		return "NewEmp";
	}
}
