package kr.ac.sejong.sjgb.domain.gathering;

import kr.ac.sejong.sjgb.domain.activity.ClassActivity;
import kr.ac.sejong.sjgb.domain.student.IntlStu;
import kr.ac.sejong.sjgb.domain.student.KorStu;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeachingClass {

    @Id
    @GeneratedValue
    @Column(name = "teaching_class_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private KorStu leader;

    @OneToMany(mappedBy = "teachingClass")
    private List<ClassActivity> classActivities;
}
