package kr.ac.sejong.sjgb.domain.student;

import kr.ac.sejong.sjgb.domain.VolunteerInfo;
import kr.ac.sejong.sjgb.domain.team.TeamKorStuLog;
import kr.ac.sejong.sjgb.domain.enums.SemesterEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class KorStu extends Student{

    @Id
    @GeneratedValue
    @Column(name = "kor_stu_id")
    private Long id;

    private Boolean is_admin_system;

    private Boolean is_leader;

    @OneToMany(mappedBy = "member")
    private List<TeamKorStuLog> team_log = new ArrayList<>();

    @OneToOne(mappedBy = "kor_stu")
    private VolunteerInfo volunteer_info;
    private int volunteer_time;


    //연관관계메서드


    //생성메서드
    public void createKorStu(Boolean is_admin_system, Boolean is_leader){

    }


}
