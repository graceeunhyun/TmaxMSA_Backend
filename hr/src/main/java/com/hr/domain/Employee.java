package com.hr.domain;
import lombok.*;

import javax.persistence.*;

// 인사 정보 domain
@Entity
@Table(name="employee_tbl")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNum;
    private String email;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Embedded
    private Account account;
}
