package com.hr.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, string 등을 자동적으로 생성
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long company_id;
    private String company_nm;
}

