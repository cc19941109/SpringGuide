package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class BaseController {

    @RequestMapping("/")
    public String toIndex() {
        return "Hello World!";
    }

}