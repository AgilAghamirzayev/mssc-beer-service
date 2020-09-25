package com.springframework.msscbeerservice.services;

import com.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    void saveNewBeer(BeerDto beerDto);
}
