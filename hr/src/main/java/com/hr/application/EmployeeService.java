package com.hr.application;

import com.hr.adapter.persistence.Account;
import com.hr.adapter.persistence.Company;
import com.hr.adapter.persistence.Employee;
import com.hr.application.dto.EmployeeCreateRequestDto;
import com.hr.adapter.persistence.EmployeeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeCreateRequestDto create(EmployeeCreateRequestDto dto) {

        Employee employee = this.dtoToEntity(dto);
        employeeRepository.save(employee);
        return dto;
    }

    // factory pattern 으로 변경
    public Employee dtoToEntity(EmployeeCreateRequestDto dto) {
        Account account = new Account(dto.getAccountId(), dto.getAccountNumber());
        Company company = Company.of(dto.getCompanyId(), null);
        Employee employee = Employee.of(dto.getId(), dto.getName(), dto.getPhoneNum(), dto.getEmail(), company, account);
        return  employee;
    }

    
}
