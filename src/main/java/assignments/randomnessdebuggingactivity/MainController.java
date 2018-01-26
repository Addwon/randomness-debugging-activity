package assignments.randomnessdebuggingactivity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {
    @RequestMapping("/")
    public String RandomGenerator(){
        System.out.println("Generate 10 random integers between 0 and 6");
        Random rnd=new Random();
        String rndNumbers="";
        for (int i = 1; i <= 12; ++i)
        {
            int randomInt = 1 + rnd.nextInt(6);
            System.out.println("Generated number: " + randomInt);
            rndNumbers+=randomInt+"<br/>";
        }

        System.out.println("Done.");

        return rndNumbers;
    }

}


