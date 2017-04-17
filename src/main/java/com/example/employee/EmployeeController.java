package com.example.employee;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	List<Employee> listEmployee = Employee.getListEmployee();
	
	@GetMapping("/employees")
    @ResponseBody
    public List<Employee> getEmployee(@RequestParam(value="gender",defaultValue="") String gender) {
    	if (gender.equals("")) {
			return listEmployee;
		}
        return listEmployee.stream().filter(s->s.getGender().equals(gender)).collect(Collectors.toList());
    }
    
    @PostMapping(value="/employees")
    @ResponseBody
    public Employee postEmployee(@RequestBody Employee employee) {
    	listEmployee.add(employee);
        return employee;
    }

}
