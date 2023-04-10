package kr.ac.sejong.sjgb.domain;

import kr.ac.sejong.sjgb.domain.student.IntlStu;
import kr.ac.sejong.sjgb.domain.student.KorStu;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MeetBuddy {

    @Id
    @GeneratedValue
    @Column(name = "meet_buddy_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kor_stu_id")
    private KorStu kor_stu;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intl_stu_id")
    private IntlStu intl_stu;

    private LocalDateTime when;

    private String description;
}
