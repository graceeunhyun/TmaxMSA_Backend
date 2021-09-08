package com.hr.domain;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="company_Tbl")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;

    private String company_nm;
}
