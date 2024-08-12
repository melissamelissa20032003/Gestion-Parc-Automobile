# Gestion-Parc-Automobile
This project aims to create a system for managing a vehicle fleet, including client management, vehicle rental, and sales functionalities. Below are the key components and their functionalities:
</br>
</br>

**Components:** </br>
- Enums:
Enumerations are used to represent specific categories such as vehicle types and number of doors.
- GestionDates Class:
This class handles date formatting using a specified pattern (dd/mm/yyyy) and handles exceptions like ParseException for invalid dates.
- Client Management:
Clients are managed using the Clients class, which is a subclass of ArrayList and stores client instances. It employs the singleton pattern to ensure a single instance of the class.
- Vehicle Management:
Vehicles are managed using various classes representing different vehicle types (e.g., Berline, Utilitaire). These classes inherit common attributes from the Vehicule class.
- Serialization:
Data serialization is implemented for storing and loading client and vehicle data. The Sauvegarde class provides methods for serializing and deserializing data.
- Exceptions Handling:
Custom exceptions like GestionAutomobileClientsException and GestionAutomobileVehiculesException are used to handle errors such as duplicate clients and invalid vehicle operations.
- Interfaces:
Interfaces like CanDrive and CanRentOrBuy are implemented to provide a unified interface for interacting with clients and vehicles.
</br> </br> </br> </br> </br>
**Project Evolution:**
- Initial Challenges:
Overcame challenges like designing a flexible client structure and managing multiple types of vehicles efficiently.
- Refactoring:
Refactored the codebase to introduce generics for the Clients class to support multiple client types.
- Error Handling:
Implemented robust error handling mechanisms to manage exceptions gracefully, ensuring system stability.
- Interface Implementation:
Utilized interfaces to streamline client and vehicle operations, reducing code redundancy and improving maintainability.
- Date Management:
Ensured proper handling of date-related operations, including validation and error checking.
</br> </br> </br> </br> </br> 

**Conclusion:**
Each obstacle encountered during the project journey served as an opportunity for learning and growth, resulting in a robust and flexible vehicle management system
