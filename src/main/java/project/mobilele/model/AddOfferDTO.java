package project.mobilele.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import project.mobilele.model.enums.EngineTypeEnum;

public record AddOfferDTO(
  @NotEmpty(message = "The description must not be empty.")
  @Size(min = 5, max = 500)
  String description,
  @NotNull @PositiveOrZero Integer mileage,
  @NotNull EngineTypeEnum engineType
) {

    public static AddOfferDTO empty(){
        return new AddOfferDTO(null, null, null);
    }




}
