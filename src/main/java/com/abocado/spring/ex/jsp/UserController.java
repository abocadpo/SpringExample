package com.abocado.spring.ex.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abocado.spring.ex.jsp.domain.User;

@Controller
public class UserController {
	
	@PostMapping("/add")
	@ResponseBody
	public String createUser(
		@RequestParam("name") String name
		, @RequestParam("birthday") String birthday
		, @RequestParam("email") String email
		, @RequestParam("introduce") String introduce
		, Model model){
		
		User user = new User();
		user.setName(name);
		user.setYyyymmdd(birthday);
		user.setEmail(email);
		user.setIntroduce(introduce);
		
		int count = userService.addUserByObject(user);
		
		model.addAttribute("result", user);
		return "jsp/userInfo";
		return "입력 성공 : " + count;
		
		}
	
	
	
}
