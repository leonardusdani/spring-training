package com.example.employee;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.employee.EmployeeController;

public class EmployeeControllerTest {
	
	private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders
            .standaloneSetup(new EmployeeController())
            .build();
    }
	
	@Test
    public void getEmployees() throws Exception{
    	this.mockMvc.perform(get("/employees?gender=male"))
    		.andExpect(status().isOk());
    }
    
    @Test
    public void postEmployee() throws Exception{
    	this.mockMvc.perform(post("/employees").contentType(MediaType.APPLICATION_JSON).content("{\"id\":4,\"name\":\"Agri\",\"gender\":\"male\"}"))
    		.andExpect(content().json("{\"id\":4,\"name\":\"Agri\",\"gender\":\"male\"}"));
    }

}
