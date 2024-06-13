package ch.cpnves.payroll.Controllers;

import ch.cpnves.payroll.Repositories.MacBookRepository;
import ch.cpnves.payroll.Entities.MacBook;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MacBookController {

    private final MacBookRepository repository;

    MacBookController(MacBookRepository repository) {
        this.repository = repository;
    }

    /* curl sample :
    curl -i -X DELETE localhost:8080/macbook/2
    */
    @DeleteMapping("/macbooks/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
