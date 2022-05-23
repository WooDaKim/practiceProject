package com.example.RecordMe.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @Column
    private Long id;    //User 구별 ID
    @Column
    private String userId;  // User가 생성한 아이디
    @Column
    private String passWord;    // User가 생성한 비밀번호
    @Column
    private String name;    //유저 이름(실명)
    @Column
    private String phone;   //유저의 휴대폰 번호    -> 아이디와 비번을 찾는데 사용
    @Column
    private String email;   //유저의 이메일 -> 아이디와 비번을 찾는데 사용
    @Column
    private String birth; //유저의 생일
    private String profile; //유저 프로필

    /* 건강 탭*/
    @Column
    private String wight;   //유저의 몸무게 -> 건강 탭에서 사용
    @Column
    private String tall;    // 유저의 키 -> 건강 탭에서 사용

    /*게시글(일기등) 탭*/
    @Column
    private String title;


    @Builder
    public User(Long id, String userId, String passWord, String name, String phone, String email, String birth, String profile, String wight, String tall, String title) {
        this.id = id;
        this.userId = userId;
        this.passWord = passWord;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
        this.profile = profile;
        this.wight = wight;
        this.tall = tall;
        this.title = title;
    }
}
