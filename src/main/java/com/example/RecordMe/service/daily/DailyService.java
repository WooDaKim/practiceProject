package com.example.RecordMe.service.daily;

import com.example.RecordMe.domain.daily.DailyRepository;
import com.example.RecordMe.dto.daily.DailyDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DailyService {

    private DailyRepository dailyRepository;

    public DailyService(DailyRepository dailyRepository) {
        this.dailyRepository = dailyRepository;
    }

    @Transactional
    public void savePost(DailyDto dailyDto) {
        return dailyRepository.save(dailyDto.toEntity()).getId();
    }
}
