package kr.ac.sejong.sjgb.domain.team;

import kr.ac.sejong.sjgb.domain.student.KorStu;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class TeamKorStuLog {

    @Id
    @GeneratedValue
    @Column(name = "team_kor_stu_log_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private TeamSemester teamSemester;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private KorStu member;

    //연관관계 메서드

    //생성메서드
}
