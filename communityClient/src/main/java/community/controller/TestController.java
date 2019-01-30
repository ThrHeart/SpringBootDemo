package community.controller;

import community.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class TestController {

//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(){
//        return restTemplate.getForObject("http://community/api/test", String.class);
        return testService.test();
    }



}
