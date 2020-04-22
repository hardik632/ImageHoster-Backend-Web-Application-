package ImageHoster.repository;

import ImageHoster.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

//The annotation is a special type of @Component annotation which describes that the class defines a data repository
@Repository
public class UserRepository {
    //Get an instance of EntityManagerFactory from persistence unit with name as 'imageHoster'
    @PersistenceUnit(unitName = "imageHoster")
    private EntityManagerFactory emf;

    //The method receives the User object to be persisted in the database
    //Creates an instance of EntityManager
    //Starts a transaction
    //The transaction is committed if it is successful
    //The transaction is rolled back in case of unsuccessful transaction



    //The method receives the entered username and password
    //Creates an instance of EntityManager
    //Executes JPQL query to fetch the user from User class where username is equal to received username and password is equal to received password
    //Returns the fetched user
    //Returns null in case of NoResultException

}