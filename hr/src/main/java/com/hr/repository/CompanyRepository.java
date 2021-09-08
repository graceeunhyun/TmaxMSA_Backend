package com.hr.repository;

import com.hr.domain.Company;
import com.hr.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
