package peatlandwebsitedemo.peatlandwebsite;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add the message to the model to display it on the view
        model.addAttribute("message", "Forecasting Human Footprint and Peatland Disturbance");
        return "home";  // Return the view name (index.html)
    }
}



/*
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Forecasting Human Footprint and Peatland Disturbance";
    }
}
*/


