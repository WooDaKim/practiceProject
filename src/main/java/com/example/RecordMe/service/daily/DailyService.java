package com.example.RecordMe.service.daily;

import com.example.RecordMe.domain.daily.Daily;
import com.example.RecordMe.domain.daily.DailyRepository;
import com.example.RecordMe.dto.daily.DailyDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static jdk.nashorn.internal.runtime.Debug.id;

@Service
public class DailyService {

    private DailyRepository dailyRepository;

    public DailyService(DailyRepository dailyRepository) {
        this.dailyRepository = dailyRepository;
    }

    @Transactional
    public Long savePost(DailyDto dailyDto) {
        return dailyRepository.save(dailyDto.toEntity()).getId();
    }

    @Transactional
    public List<DailyDto> getDailyList() {
        List<Daily> dailys = dailyRepository.findAll();
        List<DailyDto> dailyDtoList = new ArrayList<>();

        for(Daily daily : dailys) {
            DailyDto dailyDto = DailyDto.builder()
                    .id(daily.getId())
                    .title(daily.getTitle())
                    .content(daily.getContent())
                    .writer(daily.getContent())
                    .createDate(daily.getCreateDate())
                    .build();

            dailyDtoList.add(dailyDto);
        }

        return dailyDtoList;
    }

    @Transactional
    public DailyDto getPost(Long id) {
        Optional<Daily> dailyWrapper = dailyRepository.findById(id);
        Daily daily = dailyWrapper.get();

        DailyDto dailyDto = DailyDto.builder()
                .id(daily.getId())
                .title(daily.getTitle())
                .content(daily.getContent())
                .writer(daily.getWriter())
                .createDate(daily.getCreateDate())
                .build();


    }

    @Transactional
    public void deletePost(Long id) {
        dailyRepository.deleteById(id);
    }
}
