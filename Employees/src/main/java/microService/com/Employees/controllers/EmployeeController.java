package microService.com.Employees.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping("{id}")
    public String getEmployeeId(@PathVariable String id){
        String jsonStr = "{\"employee\": \""+id+"\"}";
        Gson gson = new Gson();
        JsonElement element = gson.fromJson (jsonStr, JsonElement.class);
        return element.toString();
    }


}
