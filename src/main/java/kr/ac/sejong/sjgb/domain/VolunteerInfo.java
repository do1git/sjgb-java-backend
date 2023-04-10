package kr.ac.sejong.sjgb.domain;

import kr.ac.sejong.sjgb.domain.student.KorStu;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class VolunteerInfo {

    @Id
    @GeneratedValue
    @Column(name = "volunteer_info_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "volunreer_info")
    private KorStu kor_stu;

    private String id1365;

    private String center_name;
}
