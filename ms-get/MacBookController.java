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
    curl -i localhost:8080/macbooks
    */
    @GetMapping("/macbooks")
    List<MacBook> all() {
        return repository.findAll();
    }

    /* curl sample :
    curl -i localhost:8080/macbook/1
    */
    @GetMapping("/macbook/{id}")
    MacBook one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new MacBookNotFoundException(id));
    }
}
