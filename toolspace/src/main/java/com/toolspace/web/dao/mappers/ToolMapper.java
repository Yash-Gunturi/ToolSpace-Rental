/**
 * 
 */
package com.toolspace.web.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.toolspace.web.modal.Tool;

/**
 * Yash Gunturi
 */
public class ToolMapper implements RowMapper<Tool>{
	
	@Override
    public Tool mapRow(ResultSet rs, int map) throws SQLException { 
  
        Tool tool = new Tool(); 
        tool.setTool_id(rs.getInt("tool_id")); 
        tool.setTool_brand(rs.getString("tool_brand"));
        tool.setTool_owner(rs.getInt("tool_owner"));
        tool.setTool_name(rs.getString("tool_name")); 
        tool.setTool_manufacturer(rs.getString("tool.manufacturer"));
        tool.setTool_description(rs.getString("tool_description")); 
        return tool; 
    } 

}
