/**
 * 
 */
package com.toolspace.web.dao;

import java.sql.PreparedStatement; 
import java.sql.SQLException; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate; 
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.toolspace.web.dao.mappers.ToolMapper;
import com.toolspace.web.modal.Tool; 

/**
 * Yash Gunturi
 */
@Component
public class ToolDAO {

    @Autowired
    JdbcTemplate jdbcTemp; 
  
	    
	    public JdbcTemplate getJdbcTemp() {
	        return jdbcTemp; 
	    } 
	  
	    public void setJdbcTemp(JdbcTemplate jdbcTemp) {
	        this.jdbcTemp = jdbcTemp; 
	    } 

	     public Tool getTool(int id) {
	          final String SQL = "select * from tool_db where tool_id = ? "; 
	          List <Tool> tools = jdbcTemp.query( 
	             SQL, new PreparedStatementSetter() {
	                 
	             public void setValues(PreparedStatement preparedStatement) throws SQLException { 
	                preparedStatement.setInt(1, id); 
	             }
	          }, 
	          new ToolMapper());
	          return tools.get(0);
	       }
	     // insert into tool_db (tool_name, tool_description, tool_brand, tool_manufacturer, tool_owner) values ('snow_blower','excellent one', 'sunbeam','sunbeam',1);
	     public boolean addToolToDB(Tool tool) {
//	          final String SQL = "insert into tool_db (tool_name, tool_description, tool_brand, tool_manufacturer, tool_owner) values (?,?,?,?,?) "; 
//	          List <Tool> tools = jdbcTemp.query( 
//	             SQL, new PreparedStatementSetter() {
//	                 
//	             public void setValues(PreparedStatement preparedStatement) throws SQLException { 
//	                preparedStatement.setString(1, tool.getTool_name());
//	                preparedStatement.setString(2, tool.getTool_description());
//	                preparedStatement.setString(3, tool.getTool_brand());
//	                preparedStatement.setString(4, tool.getTool_manufacturer());
//	                preparedStatement.setInt(5, tool.getTool_owner());
//	             } 
//	          })
////	          new ToolMapper());
	         return true;
	       }
	     
}
