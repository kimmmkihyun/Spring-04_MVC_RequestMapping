package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample")  // 요청에 공통으로 들어가는 단어를 설정해놓으면 편하다
public class SampleController {
	
	//@RequestMapping("sample/input")
	@RequestMapping("/input")
	public String input() {
		return "sample/input";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "sample/list";
	}
	
}
  	