package academy.kata.mis.personservice;

import academy.kata.mis.personservice.model.Person;
import academy.kata.mis.personservice.util.PersonServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PersonServiceRepositoryTestApplication {

    static PersonServiceManager personServiceManager;

    @Autowired
    public void setServiceManager(PersonServiceManager personServiceManager) {
        this.personServiceManager = personServiceManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonServiceRepositoryTestApplication.class, args);

        Person person = personServiceManager.getPersonService().findById(1);
        System.out.println(person.getFirstName());
    }
}
