package community.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceFailure implements TestService {
    @Override
    public String test() {
        return "service hystrix";
    }
}
