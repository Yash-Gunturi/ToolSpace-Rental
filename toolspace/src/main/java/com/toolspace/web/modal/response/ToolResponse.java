/**
 * 
 */
package com.toolspace.web.modal.response;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.toolspace.web.modal.Tool;

/**
 * Yash Gunturi
 */
public class ToolResponse {

	HashSet<Tool> toolList = new HashSet<Tool>(); 
	Tool tool;
	String message;
	
	
	/**
	 * @return the toolList
	 */
	public HashSet<Tool> getToolList() {
		return toolList;
	}
	/**
	 * @param toolList the toolList to set
	 */
	public void setToolList(HashSet<Tool> toolList) {
		this.toolList = toolList;
	}
	/**
	 * @return the tool
	 */
	public Tool getTool() {
		return tool;
	}
	/**
	 * @param tool the tool to set
	 */
	public void setTool(Tool tool) {
		this.tool = tool;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
