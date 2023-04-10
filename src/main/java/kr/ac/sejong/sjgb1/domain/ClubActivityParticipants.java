package kr.ac.sejong.sjgb1.domain;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClubActivityParticipants {

    @Id
    @GeneratedValue
    @Column(name = "club_activity_participants_idx")
    private long idx;

    private long userIdx;

    @Enumerated(EnumType.STRING)
    private Status status;
    public enum Status {REGISTERED, CANCELED, ACCEPTED, REJECTED, DONE}

    private int volunteerHour;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "club_idx")
    private ClubActivity clubActivity;
}
