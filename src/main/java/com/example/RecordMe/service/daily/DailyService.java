package com.example.RecordMe.service.daily;

import com.example.RecordMe.domain.daily.Daily;
import com.example.RecordMe.domain.daily.DailyRepository;
import com.example.RecordMe.dto.daily.DailyDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Service
public class DailyService {

    private DailyRepository dailyRepository;
    private static final int BLOCK_PAGE_NUM_COUNT = 5; //블럭에 존재하는 페이지 수
    private static final int PAGE_POST_COUNT = 4; // 한 페이지에 존재하는 게시글 수

    public DailyService(DailyRepository dailyRepository) {
        this.dailyRepository = dailyRepository;
    }

    @Transactional
    public Long savePost(DailyDto dailyDto) {
        return dailyRepository.save(dailyDto.toEntity()).getId();
    }

    @Transactional
    public List<DailyDto> getDailyList(Integer pageNum) {

        Page<Daily> page = dailyRepository
                .findAll(PageRequest
                        .of(pageNum-1, PAGE_POST_COUNT, Sort.by(Sort.Direction.ASC, "createdDate")));



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

return null;
    }

    @Transactional
    public void deletePost(Long id) {
        dailyRepository.deleteById(id);
    }
}
