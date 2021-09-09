package com.hr.controller;

import com.hr.dto.CompanyDto;
import com.hr.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/v0/companies/", method = {RequestMethod.GET,RequestMethod.POST})
public class CompanyController {
    private final CompanyService companyService; // final 로 선언


    @PostMapping(value="create")
    public String createCompany(@RequestBody  CompanyDto dto) {
        companyService.create(dto);
        return "create2";
    }
}
