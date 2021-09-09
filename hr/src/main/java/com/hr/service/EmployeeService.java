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

    public Long create(EmployeeDto dto) {
        Employee employee = dtoToEntity(dto);
        employeeRepository.save(employee);
        return employee.getId();
    }

    public Employee dtoToEntity(EmployeeDto dto) {
        Account account = new Account(dto.getAccountId(), dto.getAccountNumber());
        Company company = Company.builder().company_id(dto.getCompanyId()).build();
        Employee employee = Employee.builder().email(dto.getEmail()).account(account).company(company).name(dto.getName()).phoneNum(dto.getPhoneNum()).build();

        return employee;
    }

    
}
