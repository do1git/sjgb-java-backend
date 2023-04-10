package kr.ac.sejong.sjgb.domain.gathering;

import kr.ac.sejong.sjgb.domain.activity.ClubActivity;
import kr.ac.sejong.sjgb.domain.student.IntlStu;
import kr.ac.sejong.sjgb.domain.student.KorStu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Club extends Gathering{

    @Id
    @GeneratedValue
    @Column(name = "club_id")
    private Long id;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<ClubActivity> clubActivities;
}
