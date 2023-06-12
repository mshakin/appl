
package com.employee.ems.appl.Controller;


import com.employee.ems.appl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {
    @Autowired
    private UserService userService;

    public EmployeeController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/employee")
    public String listEmployees(Model model) {
        model.addAttribute("employee",userService.getAllEmployees());
        return "employee";
    }


}

