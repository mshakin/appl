package com.employee.ems.appl.service;



        import com.employee.ems.appl.entity.Department;
        import com.employee.ems.appl.entity.Employee;

        import java.util.List;

public interface UserService {
    List<Department> listAll();
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);


}
