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
    curl -i -X PUT localhost:8080/macbook/2 ^
        -H "Content-type:application/json" ^
        -d "{\"name\": \"Air\", \"capacity\": \"512 Go\"}"
     */
    @PutMapping("/macbooks/{id}")
    MacBook replaceMacBook(@RequestBody MacBook newMacBook, @PathVariable Long id) {
        return repository.findById(id)
                .map(macBook -> {
                    macBook.setName(newMacBook.getName());
                    macBook.setCapacity(newMacBook.getCapacity());
                    return repository.save(macBook);
                })
                .orElseGet(() -> {
                    newMacBook.setId(id);
                    return repository.save(newMacBook);
                });
    }
}
