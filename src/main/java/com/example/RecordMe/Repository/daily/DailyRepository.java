package com.example.RecordMe.Repository.daily;

import com.example.RecordMe.domain.daily.Daily;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyRepository extends JpaRepository<Daily, Long> {
}
