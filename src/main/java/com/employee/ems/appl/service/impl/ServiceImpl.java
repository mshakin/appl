package com.employee.ems.appl.service.impl;




        import com.employee.ems.appl.entity.Employee;
        import com.employee.ems.appl.repository.EmployeeRepository;
        import com.employee.ems.appl.service.UserService;
        import org.springframework.stereotype.Service;

        import java.util.List;
@Service
public class ServiceImpl implements UserService {
    private EmployeeRepository employeeRepository;

    public ServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }
}
