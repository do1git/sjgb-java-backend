package kr.ac.sejong.sjgb.domain.team;

import kr.ac.sejong.sjgb.domain.Tools;
import kr.ac.sejong.sjgb.domain.enums.TeamEnum;
import kr.ac.sejong.sjgb.exception.NotInEnumException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private long id;

    @Enumerated(EnumType.STRING)
    private TeamEnum name;

    private String description;

    @OneToMany(mappedBy = "team")
    private List<TeamSemester> team_semester = new ArrayList<>();

    //연관관계메서드


    //생성메서드
    public static Team createTeam(TeamEnum name, String description) {
        if(!Tools.contains(TeamEnum.class, String.valueOf(name))) throw new NotInEnumException("생성할 수 없는 팀 코드입니다.");

        Team team = new Team();

        team.setName(name);
        team.setDescription(description);
        team.setTeam_semester(null);


        return team;
    }

}
