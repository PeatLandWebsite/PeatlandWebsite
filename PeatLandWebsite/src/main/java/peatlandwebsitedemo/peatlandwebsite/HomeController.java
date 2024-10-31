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
        model.addAttribute("message1_p", "Peatlands are vital ecosystems that store carbon, regulate water, and support biodiversity, making them crucial for climate change mitigation. However, extensive peatland loss has occurred due to human activities such as oil extraction, forestry, and agriculture—particularly in Canada, where up to 70% of wetlands in major agricultural areas have been impacted. Alberta’s energy sector has notably affected peatlands, with oil, gas, and mining activities disturbing thousands of square kilometres. Given peatlands' irreplaceable role in carbon storage, preserving these ecosystems is essential, though recent studies raise questions about the economic viability of conservation efforts.\n" +
                "\n" +
                "This project develops models to estimate baseline disturbance rates in Alberta’s peatlands, examining how major human activities such as energy and agricultural activities contribute to peatland conversion and degradation. By establishing these baseline rates, the research will forecast peatland loss under alternative scenarios, assess conservation costs, and explore viable retention strategies. Findings will assist decision-makers in creating sustainable peatland management policies in Alberta, benefiting both climate objectives and local communities.");
        model.addAttribute("message1","Overview");
        model.addAttribute("message2","Research Ideas");
        model.addAttribute("message2_p","Let Me thinks");
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


