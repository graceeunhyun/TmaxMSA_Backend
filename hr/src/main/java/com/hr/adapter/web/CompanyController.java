package com.hr.adapter.web;

import com.hr.application.dto.CompanyCreateRequestDto;
import com.hr.application.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService; // final 로 선언


    @PostMapping(value="/api/v0/companies/create")
    public String createCompany(@RequestBody CompanyCreateRequestDto dto) {
        companyService.create(dto);
        return "create2";
    }
}
