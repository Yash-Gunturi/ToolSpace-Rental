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
	      
	     public Tool getTool(final int id) {
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
	     
	     
}
