/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mini.Project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


@Path("mydata")
public class Student {
	
	@GET
	@Produces( MediaType.APPLICATION_JSON)
	public String getJSON() throws JSONException
	{
		
		JSONArray array = new JSONArray(); 
		JSONObject j = new JSONObject(); 
		
		j.put("name", "AJAY"); 
		j.put("roll", "1"); 
		array.put(j); 
		
		j = new JSONObject(); 
		j.put("name", "AMIT"); 
		j.put("roll", "2"); 
		array.put(j);
		
		System.out.println(array);
		return array.toString();
	  
	}
}
