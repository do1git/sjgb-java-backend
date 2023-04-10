package kr.ac.sejong.sjgb.domain.log;

import kr.ac.sejong.sjgb.domain.activity.ClassActivity;
import kr.ac.sejong.sjgb.domain.activity.ClubActivity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassActivityLog extends ActivityLog {
    @Id
    @GeneratedValue
    @Column(name = "class_activity_log")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_activity_id")
    private ClassActivity classActivity;
}
