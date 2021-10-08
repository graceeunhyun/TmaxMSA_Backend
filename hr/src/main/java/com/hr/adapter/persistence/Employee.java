package com.hr.adapter.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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

    @ManyToOne(fetch = FetchType.LAZY)
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
