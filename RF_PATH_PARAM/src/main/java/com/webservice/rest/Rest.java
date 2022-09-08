package com.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calc")
public class Rest {
	
	@GET
	@Path("/add/{i}/{j}")
	public String add(@PathParam("i")int i, @PathParam("j")int j)
	{
		return "result = "+(i+j);
	}
	@GET
	@Path("/sub/{i}/{j}")
	public String sub(@PathParam("i")int i, @PathParam("j")int j)
	{
		return "result = "+(i-j);
	}

}
