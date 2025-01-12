/**
 * 
 */
package com.toolspace.web.service;

import java.util.HashSet;

import com.toolspace.web.modal.Tool;

/**
 * Yash Gunturi
 */
public interface ToolService {
	 HashSet<Tool> findAllTool(); 
     Tool findToolByID(long id); 
     void addTool(Tool b); 

}
