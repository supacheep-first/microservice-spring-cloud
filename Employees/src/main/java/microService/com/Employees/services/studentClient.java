package microService.com.Employees.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "student-service")
public class studentClient {

    @GetMapping("/student/{id}")
    public String getStudentId(@PathVariable String id) {
        return null;
    }
}
