package com.chandra.rest;
 
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/customers")
public class RestServiceFormParam {
	
	@POST
	@Path("/addCustomer")
	@Produces("text/html")
	public Response getResultByPassingValue(
					@FormParam("nameKey") String name,
					@FormParam("countryKey") String country) {
		
		String output = "<font face='verdana' size='2'>" +
				"Web Service has added your Customer information with Name - <u>"+name+"</u>, Country - <u>"+country+"</u></font>"; 
		return Response.status(200).entity(output).build();
 
	}
}
