package kr.ac.sejong.sjgb.domain.gathering;

import kr.ac.sejong.sjgb.domain.student.KorStu;
import lombok.Getter;

import javax.persistence.*;



@Getter
@MappedSuperclass
public abstract class Gathering {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kor_stu_id")
    private KorStu leader;

    private String name;

    private String description;
}
