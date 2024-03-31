package in.priya.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String str="welcome to Priya IT";
		return str;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String str="Good Morning";
		return str;
	}
	
	@GetMapping("/aboutUs")
	public String getAboutus()
	{
		String str="present in Airoli navi Mumbai";
		return str;
	}
	
	@GetMapping("/contactUs")
	public String getContactUs()
	{
		String str="+91-7895478964";
		return str;
	}
	
	

}
