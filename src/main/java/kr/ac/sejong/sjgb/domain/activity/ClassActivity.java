package kr.ac.sejong.sjgb.domain.activity;

import kr.ac.sejong.sjgb.domain.gathering.TeachingClass;
import kr.ac.sejong.sjgb.domain.log.ClassActivityLog;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ClassActivity extends Activity{
    @Id
    @GeneratedValue
    @Column(name = "class-activity_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teaching_class_id")
    private TeachingClass teachingClass;

    @OneToMany(mappedBy = "classActivity")
    private List<ClassActivityLog> classActivityLogs = new ArrayList<>();
}
