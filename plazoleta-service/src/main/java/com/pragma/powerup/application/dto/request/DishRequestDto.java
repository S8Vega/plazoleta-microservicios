package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DishRequestDto {
    private Long idDish;
    private String nameDish;
    private String idCategory;
    private String descriptionDish;
    private String priceDish;
    private RestaurantModel restaurantDish;
    private String urlImageDish;
    private String stateDish;
}
