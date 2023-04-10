package kr.ac.sejong.sjgb.domain;

import kr.ac.sejong.sjgb.domain.student.KorStu;

import javax.persistence.*;

@Entity
public class Notice {
    @Id
    @GeneratedValue
    @Column(name = "notice_id")
    private Long id;

    private String title;

    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    private KorStu created_by;


}
