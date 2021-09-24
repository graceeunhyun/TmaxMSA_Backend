package com.hr.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter, setter, string 등을 자동적으로 생성
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCreateRequestDto {
    private String id;
    private String name;
    private String phoneNum;
    private String email;
    private String accountId;
    private String accountNumber;
    private String companyId;
}
