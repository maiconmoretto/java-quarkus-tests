package org.acme.getting.started;

import javax.inject.Inject;
import org.acme.getting.started.service.CalculadoraService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CalculadoraServiceTest {

    @Inject
    CalculadoraService service;

    @Test
    public void testSomaService() {
        Assertions.assertEquals(3, service.soma(1, 2));
    }
}