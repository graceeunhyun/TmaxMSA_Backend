package com.hr.adapter.web;

import com.hr.application.dto.CompanyCreateRequestDto;
import com.hr.application.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/companies")
public class CompanyController {
    private final CompanyService companyService; // final 로 선언

    @PostMapping(value="/create")
    public String createCompany(@RequestBody CompanyCreateRequestDto dto) {
        companyService.create(dto);
        return "create2";
    }
}
