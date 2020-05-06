package jim.katunguka.JenkinsTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/output")
    public String output(){
        return "This is my output";
    }
}
