package com.fin.breweryapp.web.controller;

import com.fin.breweryapp.web.model.BeerDTO;
import com.fin.breweryapp.web.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

	private final BeerService beerService;

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	@GetMapping("/{beerId}")
	public ResponseEntity<?> getBeer(@PathVariable("beerId") UUID beerId) {

		return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> saveBeer(@RequestBody BeerDTO beerDTO) {
		BeerDTO savedBeerDTO = beerService.saveBeer(beerDTO);
		return new ResponseEntity<>(savedBeerDTO, HttpStatus.OK);
	}

	@PutMapping("/{beerId}")
	public ResponseEntity<?> updateBeer(@RequestBody BeerDTO beerDTO, @PathVariable("beerId") UUID beerId) {

		return new ResponseEntity<>(beerService.updateBeer(beerId), HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/{beerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer( @PathVariable("beerId") UUID beerId) {

		beerService.deleteBeerById(beerId);
	}
}
