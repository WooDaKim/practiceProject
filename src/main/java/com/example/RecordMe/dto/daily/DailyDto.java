package com.example.RecordMe.dto.daily;

import com.example.RecordMe.domain.daily.Daily;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class DailyDto {
    private Long id;
    private String writer;
    private String whether;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    public Daily toEntity() {
        Daily daily = Daily.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return daily;

    }

}
