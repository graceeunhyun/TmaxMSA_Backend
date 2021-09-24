package com.hr.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, string 등을 자동적으로 생성
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CompanyCreateRequestDto {
    private String company_id;
    private String company_nm;
}

