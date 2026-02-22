package project.mobilele.model;

public record UserRegistrationDTO(String firstName, String lastName, String password, String email) {
    // THESE HAVE TO MATCH THE NAMES/IDS IN THE TEMPLATE
}
