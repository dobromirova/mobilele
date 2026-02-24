package project.mobilele.model;

import project.mobilele.model.enums.EngineTypeEnum;

public record OfferDetailsDTO(
        Long id,
        String description,
        Integer mileage,
        EngineTypeEnum engineType
) {
}
