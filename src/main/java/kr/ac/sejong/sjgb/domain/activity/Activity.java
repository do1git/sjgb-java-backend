package kr.ac.sejong.sjgb.domain.activity;

import kr.ac.sejong.sjgb.domain.Notice;
import lombok.Getter;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public abstract class Activity {

    private String title;

    private String description;

    private String where;

    private LocalDateTime when;

    private int duration;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notice_id")
    private Notice notice;

}
