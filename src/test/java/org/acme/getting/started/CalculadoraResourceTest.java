package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculadoraResourceTest {

    @Test
    public void testSoma() {
        given()
            .pathParam("a", 1)
            .pathParam("b", 2)
        .when().post("/calculadora/soma/{a}/{b}")
        .then()
        .statusCode(200)
        .body(is("3"));
    }

}