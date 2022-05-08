package com.example.RecordMe.domain.daily;

import com.example.RecordMe.domain.time.TimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Daily extends TimeEntity {

    @Id
    @Column
    /*인식하는 id(PK)*/
    private Long id;

    /* 제목 */
    private String title;

    /* 날씨 */
    private String whether;

    /* 내용 */
    private String content;

    /* 비밀여부 */
    private String secret;

    /* 생성일 */
    private LocalDateTime createDate = LocalDateTime.now();

    /* 수정일 */
    private LocalDateTime modifiedDate;

    @Builder
    public Daily(Long id, String title, String whether, String content, String secret, LocalDateTime createDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.title = title;
        this.whether = whether;
        this.content = content;
        this.secret = secret;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }
}
