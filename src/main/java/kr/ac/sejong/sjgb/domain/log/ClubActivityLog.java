package kr.ac.sejong.sjgb.domain.log;

import kr.ac.sejong.sjgb.domain.activity.ClubActivity;
import kr.ac.sejong.sjgb.domain.student.IntlStu;
import kr.ac.sejong.sjgb.domain.student.KorStu;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClubActivityLog extends ActivityLog{

    @Id
    @GeneratedValue
    @Column(name = "club_activity_log")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_activity_id")
    private ClubActivity clubActivity;


}
