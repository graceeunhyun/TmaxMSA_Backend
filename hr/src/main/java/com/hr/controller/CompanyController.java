package com.hr.controller;

import com.hr.dto.CompanyCreateRequestDto;
import com.hr.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
