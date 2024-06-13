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
    curl -i -X POST localhost:8080/macbooks ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Air\", \"capacity\": \"2 To\"}"
    */
    @PostMapping("/macbooks")
    MacBook newEmployee(@RequestBody MacBook newMacBook) {
        return repository.save(newMacBook);
    }
}
