package kr.ac.sejong.sjgb1.domain;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ClubActivity {

    @Id
    @GeneratedValue
    @Column(name = "club_activity_idx")
    private Long idx;


    private String title;

    private String description;

    private String where;

    private LocalDateTime when;

    private int duration;


//    @OneToMany(mappedBy = "club_activity_idx", cascade = CascadeType.ALL)
//    private List<ClubActivityParticipants> clubActivityParticipants;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "club_idx")
    private Club club;

}
