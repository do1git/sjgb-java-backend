package kr.ac.sejong.sjgb1.domain;



import javax.persistence.*;
import java.util.List;

@Entity
public class Club {

    @Id
    @GeneratedValue
    @Column(name = "club_idx")
    private Long idx;

    private long leaderUserIdx;

    private String name;

    private String description;

//    @OneToMany(mappedBy = "club_idx", cascade = CascadeType.ALL)
//    private List<ClubActivity> clubActivities;
}
