package kr.ac.sejong.sjgb1.domain;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_idx")
    private Long idx;
    private boolean admin;

    private String name;
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    public enum Gender {MALE, FEMALE}

    private String nationality;

    public enum StudentType {FULL_TIME, EXCHANGE}
    private StudentType studentType;

    private int volunteerHour = 0;

    public enum Team {EXEC, ADMINI, PROMOTION, PLANNING, VIDEO}
    Team team;
    // 속성

//    @Formula("(case " +
//            "when student_type = 'FULL_TIME' and nationality = 'korea' then 'KOREAN' " +
//            "when student_type = 'FULL_TIME' and nationality != 'korea' then 'FOREIGNER' " +
//            "when student_type = 'EXCHANGE' and nationality != 'korea' then 'FOREIGNER_EXCHANGE' " +
//            "default 'ERROR'" +
//            ")")
//    private String type;

//    private boolean leader;
//    @OneToMany(mappedBy = "member")
//    private List<TeamKorStuLog> teamLog = new ArrayList<>();
//    @OneToOne(mappedBy = "kor_stu")
//    private VolunteerInfo volunteerInfo;
    // 상태


    User(boolean admin, String name, String email, Gender gender, String nationality, boolean exchange){
        this.admin = admin;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.nationality = nationality;
        this.studentType = exchange?StudentType.EXCHANGE:StudentType.FULL_TIME;
    }

    public User createKoreanUser(
            boolean admin, String name, String email, Gender gender, String nationality,
            Team team
    ){
        User user = new User(admin, name, email, gender, nationality, false);
        user.team = team;
        return user;
    }

    public User createForeignUser(
            boolean admin, String name, String email, Gender gender, String nationality, boolean exchange
    ){
        User user = new User(admin, name, email, gender, nationality, exchange);
        return user;
    }
}
