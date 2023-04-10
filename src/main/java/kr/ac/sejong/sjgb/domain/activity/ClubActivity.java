package kr.ac.sejong.sjgb.domain.activity;

import kr.ac.sejong.sjgb.domain.gathering.Club;
import kr.ac.sejong.sjgb.domain.log.ClubActivityLog;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ClubActivity extends Activity {

    @Id
    @GeneratedValue
    @Column(name = "club_activity_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Club club;

    @OneToMany(mappedBy = "clubActivity")
    private List<ClubActivityLog> clubActivityLogs = new ArrayList<>();


}
