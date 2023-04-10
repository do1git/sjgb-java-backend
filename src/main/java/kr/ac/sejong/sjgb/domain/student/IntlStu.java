package kr.ac.sejong.sjgb.domain.student;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class IntlStu extends Student {

    @Id
    @GeneratedValue
    @Column(name = "intl_stu_id")
    private Long id;
    private String nationality;

    private Boolean is_exchange;
}
