package com.hr.adapter.persistence;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="company_Tbl")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid")
    @Column(name="company_id", nullable = false, unique = true)
    private String company_id;

    @Column(name="company_nm", nullable = false, unique = true)
    private String company_nm;

    private Company(String company_id, String company_nm) {
        this.company_id = company_id;
        this.company_nm = company_nm;
    }
    public static Company of(String company_id, String company_nm) {
        return new Company(company_id, company_nm);
    }
}
