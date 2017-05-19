package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sleroy on 19/05/17.
 */
@RestController
public class ControllerTest {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }

}
