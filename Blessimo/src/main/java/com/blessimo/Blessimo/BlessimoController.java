package com.blessimo.Blessimo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.persistence.Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

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
