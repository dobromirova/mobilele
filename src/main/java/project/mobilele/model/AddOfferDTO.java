package project.mobilele.model;

import project.mobilele.model.enums.EngineTypeEnum;

public record AddOfferDTO(
  String description,
  Integer mileage,
  EngineTypeEnum engineType
) {

    public static AddOfferDTO empty(){
        return new AddOfferDTO(null, null, null);
    }




}
