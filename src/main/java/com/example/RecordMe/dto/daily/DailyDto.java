package com.example.RecordMe.dto.daily;

import com.example.RecordMe.domain.daily.Daily;
import lombok.*;

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

    @Builder
    public DailyDto(Long id, String writer, String whether, String title, String content, LocalDateTime createDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.writer = writer;
        this.whether = whether;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }
}
