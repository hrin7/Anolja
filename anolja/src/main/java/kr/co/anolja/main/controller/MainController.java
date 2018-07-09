package kr.co.anolja.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/*")
public class MainController {
	@RequestMapping(value="main", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("model", model);
		return "main/main";
	}
}
