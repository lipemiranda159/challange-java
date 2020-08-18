package challange.aceleradev.endpoints;

import challange.aceleradev.entity.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logger")
public class LoggerController {

    @PostMapping("log")
    public void AddLog(@RequestBody Log log)
    {

    }

    @GetMapping("/all")
    public List<Log> GetLosgs()
    {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Log> findById(@PathVariable("id") Long id) {

        return null;
    }
}
