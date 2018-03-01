package com.sslServer.Server.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1")
public class ServerRestController {

	@RequestMapping("/testConnection")
	@ResponseBody
	public String testServer()
	{
		try
		{
			return "Successful connection test";
		}
		catch(Exception ex)
		{
			System.out.println("An error occurred during simple test: " + ex.toString());
			return "An Exception was caught trying to complete request";
		}
	}
}
