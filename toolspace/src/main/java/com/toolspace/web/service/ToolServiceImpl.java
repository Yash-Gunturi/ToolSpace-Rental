/**
 * 
 */
package com.toolspace.web.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.toolspace.web.modal.Tool;

/**
 * Yash Gunturi
 */
@Service
public class ToolServiceImpl implements ToolService{
		  
	    HashSet<Tool> toolList = new HashSet<Tool>(); 
	    ToolServiceImpl(){
	    	Tool t= new Tool();
	    	t.setTool_id(9001);
	    	t.setTool_description("HeaterFan 400W Sunbeam Made in USA");
	    	t.setTool_name("Heaterfan");
	    	toolList.add(t);
	    }
	    @Override
	    public HashSet<Tool> findAllTool() { 
	        if (toolList.isEmpty()) 
	            return null; 
	        else
	            return toolList; 
	    } 
	    @Override
	    public Tool findToolByID(long id) { 
	        Tool tool = toolList.stream().filter(x -> x.getTool_id() == id).findAny().orElse(null); 
	        return tool; 
	    } 
	    @Override
	    public void addTool(Tool b) { 
	        toolList.add(b); 
	    } 

}
