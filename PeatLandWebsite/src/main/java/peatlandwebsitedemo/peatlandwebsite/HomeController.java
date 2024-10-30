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
        model.addAttribute("message", "The Peatland Disturbance and Human Footprint Research Project website is dedicated to studying the impacts of human activities on peatlands, focusing on developing advanced machine learning models to forecast peatland disturbances. By leveraging datasets from the Alberta Biodiversity Monitoring Institute (ABMI) and incorporating human footprint data, the project aims to build accurate models that can capture complex spatial and temporal dynamics. This research explores diverse human-induced factors, such as industrial activities, agricultural land expansion, and infrastructure development, which contribute to peatland degradation. Utilizing modern machine learning techniques like CNNs, LSTMs, and Transformers, along with high-performance computing, the project seeks to provide data-driven insights and predictive tools to inform conservation policies, manage ecological impacts, and support sustainable land use in Alberta and beyond.");
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


