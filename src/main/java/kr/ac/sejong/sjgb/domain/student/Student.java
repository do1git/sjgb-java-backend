package kr.ac.sejong.sjgb.domain.student;

import kr.ac.sejong.sjgb.domain.activity.ClubActivity;
import kr.ac.sejong.sjgb.domain.enums.GenderEnum;
import kr.ac.sejong.sjgb.domain.enums.SemesterEnum;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@MappedSuperclass
public abstract class Student {



    private String name;

    private String email;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @ElementCollection(targetClass = SemesterEnum.class)
    @CollectionTable(name = "semesters", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    private List<SemesterEnum> joined_semester = new ArrayList<>();


}
