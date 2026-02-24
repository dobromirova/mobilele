package project.mobilele.service.impl;

import org.springframework.stereotype.Service;
import project.mobilele.model.AddOfferDTO;
import project.mobilele.model.OfferDetailsDTO;
import project.mobilele.model.entity.OfferEntity;
import project.mobilele.repository.OfferRepository;
import project.mobilele.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public long createOrder(AddOfferDTO addOfferDTO) {

        return offerRepository.save(map(addOfferDTO)).getId();

        // returns order ID
    }

    @Override
    public OfferDetailsDTO getOfferDetails(Long id) {
       return this.offerRepository
                .findById(id)
                .map(OfferServiceImpl::toOfferDetails)
                .orElseThrow();
    }


    private static OfferDetailsDTO toOfferDetails(OfferEntity offerEntity) {

        return new OfferDetailsDTO(offerEntity.getId(),
                offerEntity.getDescription(),
                offerEntity.getMileage(),
                offerEntity.getEngine());

    }




    private static OfferEntity map(AddOfferDTO addOfferDTO) {
        OfferEntity offerEntity = new OfferEntity();

        offerEntity.setDescription(addOfferDTO.description());
        offerEntity.setEngine(addOfferDTO.engineType());
        offerEntity.setMileage(addOfferDTO.mileage());


        return offerEntity;
    }


}
