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
public class User  {

    @Id
    @Column
    private Long id;
    @Column
    private String userId;
    @Column
    private String passWord;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String birth;
    @Column
    private String wight;
    @Column
    private String tall;

    @Builder
    public User(Long id, String userId, String passWord, String name, String phone, String email, String birth) {
        this.id = id;
        this.userId = userId;
        this.passWord = passWord;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
    }
}
