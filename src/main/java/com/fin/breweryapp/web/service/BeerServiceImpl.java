package com.fin.breweryapp.web.service;

import com.fin.breweryapp.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Johny Walker").beerStyle("walker").build();
	}

	@Override
	public void deleteBeerById(UUID beerId) {
		log.info("Deleting the beer ");
	}

	@Override
	public BeerDTO updateBeer(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Johny Walker").beerStyle("walker").build();
	}

	@Override
	public BeerDTO saveBeer(BeerDTO beerDTO) {
		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Johny Walker").beerStyle("walker").build();
	}
}
