package com.hr.adapter.web;

import com.hr.application.dto.EmployeeCreateRequestDto;
import com.hr.application.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService; // final 로 선언

    @PostMapping(value="/api/v0/employees/create")
    public EmployeeCreateRequestDto createCompany(@RequestBody EmployeeCreateRequestDto dto) {
        return employeeService.create(dto);
    }
}
