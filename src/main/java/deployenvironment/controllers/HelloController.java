package deployenvironment.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloProd() {
        String hello = welcomeMsg;
        return ResponseEntity.ok(hello);
    }

}