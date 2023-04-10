package kr.ac.sejong.sjgb1.domain;

import javax.persistence.*;

@Entity
public class UserTeamHistory {

    @Id
    @GeneratedValue
    @Column(name = "team_hisotry_idx")
    private Long idx;
    private boolean leader;
    public enum Team {EXEC, ADMINI, PROMOTION, PLANNING, VIDEO}
    Team team;
    // 속성

    private long userIdx;

    private int year;
    private int semester;


}
