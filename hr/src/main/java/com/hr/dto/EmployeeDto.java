package com.hr.dto;

import lombok.Builder;
import lombok.Data;

@Data // getter, setter, string 등을 자동적으로 생성
@Builder(toBuilder = true)

public class EmployeeDto {
    private Long id;
    private String name;
    private String phoneNum;
    private String email;
    private String accountId;
    private String accountNumber;
    private Long companyId;
}
