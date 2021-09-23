package com.hr.service;

import com.hr.domain.Company;
import com.hr.dto.CompanyCreateRequestDto;
import com.hr.repository.CompanyRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public Long create(CompanyCreateRequestDto dto) {
        Company entity = dtoToEntity(dto);
        companyRepository.save(entity);
        return null;
    }

    Company dtoToEntity(CompanyCreateRequestDto dto) {
        Company company = Company.of(dto.getCompany_id(), dto.getCompany_nm());

        return company;
    }

}
