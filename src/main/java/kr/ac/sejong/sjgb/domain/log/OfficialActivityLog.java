package kr.ac.sejong.sjgb.domain.log;

import kr.ac.sejong.sjgb.domain.activity.ClubActivity;
import kr.ac.sejong.sjgb.domain.activity.OfficialActivity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class OfficialActivityLog extends ActivityLog{

    @Id
    @GeneratedValue
    @Column(name = "official_activity_log")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "official_activity_id")
    private OfficialActivity officialActivity;
}
