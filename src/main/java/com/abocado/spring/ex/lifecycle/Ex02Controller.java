package com.abocado.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex01")
	public String jspPage() {
		return	"lifecycle/ex01";
	}
	
	
	
}
