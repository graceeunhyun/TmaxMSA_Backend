package com.hr.dto;

import lombok.Builder;
import lombok.Data;

@Data // getter, setter, string 등을 자동적으로 생성
@Builder(toBuilder = true)
public class CompanyDto {
    private Long company_id;
    private String company_nm;
}
