package com.karma.infra.usermanager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckController {
	
	@GetMapping("/")
	public  Map<String, String> checkstatus() {
		    HashMap<String, String> map = new HashMap<>();
		    map.put("status", "up");
		    map.put("version", "1");
		    map.put("description", "Test Spring boot metrics");
		    return map;
	
	}
}
