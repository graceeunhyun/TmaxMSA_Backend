package com.hr.service;

import com.hr.domain.Account;
import com.hr.domain.Company;
import com.hr.domain.Employee;
import com.hr.dto.EmployeeDto;
import com.hr.repository.EmployeeRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public String create(EmployeeDto dto) {

        Employee employee = this.dtoToEntity(dto);
        employeeRepository.save(employee);
        return employee.getId();
    }

    // factory pattern 으로 변경
    public Employee dtoToEntity(EmployeeDto dto) {
        Account account = new Account(dto.getAccountId(), dto.getAccountNumber());
        Company company = Company.of(dto.getCompanyId(), null);
        Employee employee = Employee.of(dto.getId(), dto.getName(), dto.getPhoneNum(), dto.getEmail(), company, account);
        return  employee;
    }

    
}
