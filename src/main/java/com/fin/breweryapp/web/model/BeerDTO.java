package com.fin.breweryapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
    private UUID id;
    private String beerName;
    private long upc;
    private String beerStyle;
}
