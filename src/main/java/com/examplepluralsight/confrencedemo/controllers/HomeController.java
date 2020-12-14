package com.examplepluralsight.confrencedemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping
	@RequestMapping("/")
	public Map getStatus() {
		Map map = new HashMap<String, String>();
		map.put("app-version", appVersion);
//		will return app version on api call localhost:5000/
		return map;
	}
}
