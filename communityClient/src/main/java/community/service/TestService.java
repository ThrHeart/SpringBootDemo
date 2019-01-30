package community.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="COMMUNITYSERVICE", fallback = TestServiceFailure.class)
public interface TestService {

    @GetMapping("/api/test")
    String test();
}
