package com.hr.domain;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

// 인사 정보 domain
@Entity
@Table(name="employee_tbl")
@Getter
@Setter
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid")
    @Column(name="id", nullable = false, unique = true)
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="phone_number")
    private String phoneNum;

    @Column(name="email")
    private String email;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Embedded
    private Account account;

    private Employee(String id, String name, String phoneNum, String email, Company company, Account account) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.company = company;
        this.account = account;
    }

    public static Employee of(String id, String name, String phoneNum, String email, Company company, Account account) {
        return new Employee(id, name, phoneNum, email, company, account);
    }
}
