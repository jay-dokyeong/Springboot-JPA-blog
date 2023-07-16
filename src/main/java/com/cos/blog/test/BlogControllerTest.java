package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 스프링이 com.cos.blog패키지 이하의 파일들을 스캔해서 특정 어노테이션 붙어있는 파일들을 new해서 스프링컨테이너에 관리해준다.
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
