package org.example.expert.domain.todo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoSearchRequest {

    private String weather;
    private LocalDate startDate;
    private LocalDate endDate;

    public String getFilteredWeather() {
        return StringUtils.hasText(this.weather) ? this.weather : null;
    }

    public LocalDateTime getStartDateTime() {
        return (this.startDate) != null ? this.startDate.atStartOfDay() : null;
    }

    public LocalDateTime getEndDateTime() {
        return (this.endDate) != null ? this.endDate.atTime(LocalTime.MAX) : null;
    }
}
