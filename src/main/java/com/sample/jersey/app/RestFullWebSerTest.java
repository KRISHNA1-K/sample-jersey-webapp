package com.sample.jersey.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/RestFullWebSerTest")
public class RestFullWebSerTest {

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String response = "<?xml version='1.0'?>" + "<hello>Hello XML</hello>";
		return response;
	}
}
