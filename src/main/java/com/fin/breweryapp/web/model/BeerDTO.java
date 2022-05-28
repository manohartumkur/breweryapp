package com.fin.breweryapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BeerDTO {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(columnDefinition = "varchar", length = 36, updatable = false, nullable = false)
	private UUID id;
	@Version
	private Integer version;
	@CreationTimestamp
	private OffsetDateTime createdDate;
	@UpdateTimestamp
	private OffsetDateTime lastModifiedDate;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private String upc;
	private BigDecimal price;
	private Integer quantityToBrew;
	private Integer minOnHand;
}
