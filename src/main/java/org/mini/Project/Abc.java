package org.mini.Project;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("abc")
public class Abc {
	
	 	@GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getIt1() throws SQLException {
	        System.out.println("In abc service");
	        return "abc"; 
	    }

}
