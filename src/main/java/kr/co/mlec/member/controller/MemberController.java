package kr.co.mlec.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.mlec.member.vo.MemberVO;

@Controller
public class MemberController {

	@GetMapping("/login")
	public String loginForm() {
		
		return "login/login";
	}
	
	@PostMapping("/login")
	public String login(MemberVO member) {
		
		System.out.println(member);
		
		return "redirect:/";
	}
}