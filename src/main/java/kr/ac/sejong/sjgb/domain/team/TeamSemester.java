package kr.ac.sejong.sjgb.domain.team;

import kr.ac.sejong.sjgb.domain.Tools;
import kr.ac.sejong.sjgb.domain.enums.SemesterEnum;
import kr.ac.sejong.sjgb.domain.student.KorStu;
import kr.ac.sejong.sjgb.exception.NotInEnumException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class TeamSemester {

    @Id
    @GeneratedValue
    @Column(name = "team_semester_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    @Enumerated(EnumType.STRING)
    private SemesterEnum semesterEnum;

    @OneToOne(fetch = FetchType.LAZY)
    private KorStu president;

    @OneToOne(fetch = FetchType.LAZY)
    private KorStu vice_president;

    @OneToOne(fetch = FetchType.LAZY)
    private KorStu secretary;

    @OneToMany(mappedBy = "teamSemester")
    private List<TeamKorStuLog> member_logs = new ArrayList<>();

    //연관관계생성 메서드
    public void addMember_logs(TeamKorStuLog teamKorStuLog) {
        this.member_logs.add(teamKorStuLog);
        teamKorStuLog.setTeamSemester(this);
    }


    //생성메서드
    public static TeamSemester createTeamSemester(Team team, SemesterEnum semesterEnum, KorStu president, KorStu vice_president, KorStu secretary){
        if(!Tools.contains(SemesterEnum.class, String.valueOf(semesterEnum))) throw new NotInEnumException("생성할 수 앖는 학기 코드입니다.");

        TeamSemester teamSemester = new TeamSemester();
        teamSemester.setTeam(team);
        teamSemester.setSemesterEnum(semesterEnum);
        teamSemester.setPresident(president);
        teamSemester.setVice_president(vice_president);
        teamSemester.setSecretary(secretary);
        teamSemester.setMember_logs(null);
        return teamSemester;
    }

}
