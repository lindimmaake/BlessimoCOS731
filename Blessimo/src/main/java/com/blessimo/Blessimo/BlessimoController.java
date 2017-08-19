package com.blessimo.Blessimo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlessimoController 
{
	@RequestMapping("/greeting")
	@ResponseBody
	String home()
	{
		return "Hellow Lindiwe";
	}

}
