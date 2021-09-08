package com.hr.controller;

import com.hr.dto.CompanyDto;
import com.hr.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService; // final 로 선언

//    @GetMapping(value="/api/v0/employees/create")
//    public String crea

    @GetMapping(value="/api/v0/companies/create")
    public String createCompany(CompanyDto dto) {
        companyService.create(dto);
        return "create";
    }
}
