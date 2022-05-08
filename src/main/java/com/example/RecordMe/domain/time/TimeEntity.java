package com.example.RecordMe.domain.time;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //테이블로 매핑하지 않고, 자식 Entity에게 매핑정보를 상속하기 위한 어노테이션이다.
public class TimeEntity {
    //데이터 조작시 자동으로 날짜를 수정해주는 entity이다.


    @CreatedDate
    @Column
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
