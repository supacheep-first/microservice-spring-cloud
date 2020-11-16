package microService.com.student.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping("{id}")
    public String getStudentId(@PathVariable String id){
        String jsonStr = "{\"student\": \""+id+"\"}";
        Gson gson = new Gson();
        JsonElement element = gson.fromJson (jsonStr, JsonElement.class);
        return element.toString();
    }
}
