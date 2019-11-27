package org.boot.yy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.boot.yy.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {
	@ResponseBody
	@RequestMapping("/request")
	public String request() {
		return "hello spring boot";
	}
	@RequestMapping("/welcome")
	public String welcome(Map<String,Object> map) {
		map.put("welcome", "welcomeThymeleaf");//给request域中放welcome
		//给thymeleaf准备数据
		List<Product> prods = new ArrayList<Product>();
		prods.add(new Product("a",100,10));
		prods.add(new Product("b",200,20));
		prods.add(new Product("c",300,30));	
		
		map.put("prods", prods);
		
		return "result";
	}
}
