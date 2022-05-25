package com.fin.breweryapp.web.service;

import com.fin.breweryapp.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

	BeerDTO getBeerById(UUID beerId);

	void deleteBeerById(UUID beerId);

	BeerDTO updateBeer(UUID beerId);

	BeerDTO saveBeer(BeerDTO beerDTO);
}
