package project.mobilele.service;

import project.mobilele.model.AddOfferDTO;
import project.mobilele.model.OfferDetailsDTO;

public interface OfferService {

void createOrder(AddOfferDTO addOfferDTO);

OfferDetailsDTO getOfferDetails(Long id);

}
