package com.example.RecordMe.domain.daily;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Daily {

    @Id
    @Column
    private Long id;

    private LastModifiedDate date;

    private String title;

    private String whether;

    private String text;

    public Daily(Long id, LastModifiedDate date, String title, String whether, String text) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.whether = whether;
        this.text = text;
    }
}
