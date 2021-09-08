package com.hr.service;

import com.hr.domain.Company;
import com.hr.dto.CompanyDto;
import com.hr.repository.CompanyRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public Long create(CompanyDto dto) {
        Company entity = dtoToEntity(dto);
        companyRepository.save(entity);
        return null;
    }

    Company dtoToEntity(CompanyDto dto) {
        Company company = Company.builder().company_nm(dto.getCompany_nm()).build();

        return company;
    }

}
