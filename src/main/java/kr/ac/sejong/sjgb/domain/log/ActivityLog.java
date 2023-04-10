package kr.ac.sejong.sjgb.domain.log;

import kr.ac.sejong.sjgb.domain.enums.ActivityStutusEnum;
import kr.ac.sejong.sjgb.domain.student.IntlStu;
import kr.ac.sejong.sjgb.domain.student.KorStu;
import lombok.Getter;

import javax.persistence.*;

@Getter
@MappedSuperclass
public abstract class ActivityLog {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kor_stu_id")
    private KorStu kor_stu;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intl_stu_id")
    private IntlStu intl_stu;

    @Enumerated(EnumType.STRING)
    private ActivityStutusEnum activityStutusEnum;
    private int volunteered_hour;

}
