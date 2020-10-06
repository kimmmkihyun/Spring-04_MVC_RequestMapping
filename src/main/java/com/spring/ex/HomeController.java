package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * 
	 * RequestMapping  :  요청과 메서드를 짝지을 때
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//2020.09.21
		//2020년 09월 21일 오후 5시
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//request.setAttribute("serverTime", formattedDate );
		//serverTime : 2020년 09월 21일 오후 5시
		
		
		return "home";
		
//		/WEB-INF/views/home.jsp
	}
	
	@RequestMapping("member/view")
	public String view() {
		System.out.println("view()");
		return "member/memberView";
		
		//return "/WEB-INF/views/member/memberview.jsp      return은  jsp파일 설정하기 위한 값이다!!!
	}
	
	@RequestMapping(value="a")
	public String a() {
		System.out.println("a()");
		return "b";
		//return "/WEB-INF/views/b.jsp
		
	}
	
	@RequestMapping("/member/input")
	public String input(Model model) {
		
		model.addAttribute("id", "abc");		
		//request.setAttribute("id", "abc");
		return "member/result";
	}
	
	@RequestMapping("member/list")
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","태연");  //name=태연
		mav.addObject("pw", 1234);  //pw=1234
			
		mav.setViewName("member/list");
		// return "member/list";   ModelAndView 는  set으로 view를 설정해줘야 한다
		
		return mav;
	}
	
	
	
}
