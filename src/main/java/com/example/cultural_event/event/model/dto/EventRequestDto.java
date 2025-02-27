package com.example.cultural_event.event.model.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class EventRequestDto {
    private String eventName;
    private String city;
    private LocalDateTime dateTimeEvent;

    public EventRequestDto(String eventName, String city, LocalDateTime dateTimeEvent) {
        this.eventName = eventName;
        this.city = city;
        this.dateTimeEvent = dateTimeEvent;
    }
}
