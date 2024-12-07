package SpringDemo1;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class ClientController {

    @RequestMapping("/welcome")
    public String welcome() 
    {
        return "greeting"; // Renders greeting.jsp
    }

    @RequestMapping("/test")
    public String renderTestPage() {
        return "test"; // Renders test.jsp
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo"; // Renders showInfo.jsp
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "calculateSum"; // Renders calculateSum.jsp
    }

    @RequestMapping("/employeeForm")
    public String renderEmployeeForm() {
        return "employeeForm"; // Renders employeeForm.jsp
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "addNumbers"; // Renders addNumbers.jsp
    }

    @RequestMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String combined = str1 + " " + str2;
        model.addAttribute("result", combined);
        return "combine"; // Renders combine.jsp
    }

    @RequestMapping("/calculate")
    public String calculateOperations(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculate"; // Renders calculate.jsp
    }
}
