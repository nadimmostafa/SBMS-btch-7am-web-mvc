package org.nadim.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private Integer productId;
	private String productName;
	private Double productPrice;
	private Boolean available;
}
