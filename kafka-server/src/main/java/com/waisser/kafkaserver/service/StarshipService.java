package com.waisser.kafkaserver.service;

import com.waisser.kafkaserver.dto.StarshipDto;

public interface StarshipService {

    StarshipDto save(StarshipDto dto);
    void send(StarshipDto dto);
    void consume(StarshipDto dto);
}
