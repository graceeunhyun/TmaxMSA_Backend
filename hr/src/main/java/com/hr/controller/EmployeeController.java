package com.hr.controller;

import com.hr.dto.EmployeeDto;
import com.hr.service.CompanyService;
import com.hr.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService; // final 로 선언

    @PostMapping(value="/api/v0/employees/create")
    public String createCompany(@RequestBody EmployeeDto dto) {
        employeeService.create(dto);
        return "create2";
    }
}
