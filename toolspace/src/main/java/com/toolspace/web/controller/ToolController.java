/**
 * 
 */
package com.toolspace.web.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toolspace.web.modal.Tool;
import com.toolspace.web.modal.response.ToolResponse;
import com.toolspace.web.service.ToolServiceImpl;

/**
 * Yash Gunturi
 */

@RestController
public class ToolController {
	@Autowired
	ToolServiceImpl toolServiceImpl; 
	  
	@PostMapping("/addAtool") 
	public void addTool(@RequestBody Tool tool) { 
		toolServiceImpl.addTool(tool); 
	} 
	
	@GetMapping("/findall") 
    public HashSet<Tool> getAllTool() { 
        return toolServiceImpl.findAllTool(); 
    } 	 
	@GetMapping("/findtools")
    public ToolResponse getAllTools() { 
		ToolResponse resp = new ToolResponse();
		HashSet<Tool> toolList =  toolServiceImpl.findAllTool(); 
		if(toolList!=null) {
			resp.setToolList(toolList);
		} else {
			resp.setMessage("No Tools found");
		}
		
        return resp;
    } 	 
	    
	@GetMapping("/") 
    public String sayHello() { 
        return "Hello123"; 
    } 
	
	@GetMapping("/findbyid/{id}") 
    public Tool geToolById(@PathVariable long id) { 
        return toolServiceImpl.findToolByID(id); 
    } 	
	@GetMapping("/findtool/{id}") 
    public ToolResponse geTool(@PathVariable long id) { 
		ToolResponse resp = new ToolResponse();
		Tool t=toolServiceImpl.findToolByID(id);
		if(t!=null)
			resp.setTool(t);
		else
			resp.setMessage("no Tool found with ID "+ id);
        return resp; 
    } 	  
	
	@GetMapping("/find/{id}") 
    public Tool getTool(@PathVariable int id) { 
        return toolServiceImpl.getDBTool(id); 
    } 	
	
	@PostMapping("/addtool")  
	public boolean addToolToDB(@RequestBody Tool tool) { 
        return toolServiceImpl.addToolToDB(tool); 
    } 	
}
