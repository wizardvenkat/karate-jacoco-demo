package com.venkat.jacoco.karatejacocoexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class KarateHelloTest {

    @Test
    public void runKarateTests() {
        Results results = Runner
            .path("classpath:com/venkat/jacoco")
            .parallel(1);

        assertEquals(0, results.getFeaturesFailed());
        // Karate.run("HelloTest.feature").relativeTo(getClass());
    }
}
