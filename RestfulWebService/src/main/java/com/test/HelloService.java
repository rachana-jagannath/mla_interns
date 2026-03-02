package com.test;


import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String simplePlainTextResponse()
	{
		return "This is simple RestFul web service Plain text Response";
		
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit")String card)
	{
		return "<html><body><h1>Simple RestAPI HTML Response card no:"+card+" </h1></body></html>";
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg) {
		return msg;
	}
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUsersData(){
		UserDetails u1=new UserDetails(1,"Rahul","KL","rahul@gmail.com",7899999);
		UserDetails u2=new UserDetails(2,"Rohit","Kohli","rohit@gmail.com",7899989);
		UserDetails u3=new UserDetails(1,"Surya","K Yadav","surya@gmail.com",7899949);
		return List.of(u1,u2,u3);
	}
}
