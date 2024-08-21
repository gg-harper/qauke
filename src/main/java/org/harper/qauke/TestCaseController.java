package org.harper.qauke;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestCaseController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/createTestCase")
    public void createTestCase() {
        createTestCase();
    }

    @PutMapping("/updateTestCase")
    public void updateTestCase() {
        updateTestCase();
    }

    @DeleteMapping("/deleteTestCase")
    public void deleteTestCase() {
        deleteTestCase();
    }
}
