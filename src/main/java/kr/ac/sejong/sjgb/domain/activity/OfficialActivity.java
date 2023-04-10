package kr.ac.sejong.sjgb.domain.activity;

import kr.ac.sejong.sjgb.domain.Notice;
import kr.ac.sejong.sjgb.domain.log.OfficialActivityLog;
import kr.ac.sejong.sjgb.domain.student.IntlStu;
import kr.ac.sejong.sjgb.domain.student.KorStu;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OfficialActivity extends Activity {
    @Id
    @GeneratedValue
    @Column(name = "official_activity_id")
    private Long id;


    @OneToMany(mappedBy = "officialActivity")
    private List<OfficialActivityLog> officialActivityLogs = new ArrayList<>();

}
