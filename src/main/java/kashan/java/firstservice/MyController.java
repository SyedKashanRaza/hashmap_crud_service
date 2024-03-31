package kashan.java.firstservice;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class MyController {
    
    PlayerRepo repo;

    public MyController(){
        this.repo = new PlayerRepo();
    }

    @GetMapping("/getPlayer")
    public Collection<Player> getAll(){
        return repo.getAll();
    }

    @PostMapping("/addPlayer")
    public String createPlayer(@RequestBody Player p){
        repo.save(p);
        return "Player with ID " + p.getId() + " has been added";
    }

    @DeleteMapping("/removePlayer")
    public String removePlayer(@RequestParam int id){
        repo.remove(id);
        return "Player with ID " + id + " has been removed";
    }

    @PutMapping("/updatePlayer")
    public String updatePlayer(@RequestBody Player p){
        repo.update(p);
        return "Player with ID " + p.getId() + " has been updated";
    }

}
