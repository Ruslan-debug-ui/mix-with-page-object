package guru.qa.tests;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class API {
    @Test
    void loginTest() {
        String body = "{ \"email\": \"eve.holt@reqres.in\", " +
                "\"password\": \"cityslicka\" }";


        given()
                .log().uri()
                .log().body()
                .body(body)
                .contentType(JSON)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }

    @Test
    void missingPasswordLoginTest() {
        String body = "{ \"email\": \"eve.holt@reqres.in\"}";

        given()
                .log().uri()
                .log().body()
                .body(body)
                .contentType(JSON)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .log().status()
                .log().body()
                .statusCode(400)
                .body("error", is("Missing password"));
    }

    @Test
    void loginTestNext() {
        String body = "{ \"email\": \"eve.holt@reqres.in\", " +
                "\"password\": \"cityslicka\" }";

       // JSONObject jsonObj = new JSONObject(jsonString.toString());
        System.out.println();
        Response response = RestAssured.given()
                .body(body)
                .contentType(JSON)
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .log().status()
                .statusCode(200)
                .extract().response();

        String readableTest = response.asPrettyString();
        System.out.println(readableTest);


       // String json = "{ \"name\": \"Baeldung\", \"java\": true }";

        JsonObject jsonObject = JsonParser.parseString(readableTest)
                .getAsJsonObject();

        

        assertTrue(jsonObject.isJsonObject());
        System.out.println(jsonObject);
        String woo = jsonObject.get("token").getAsString();
        System.out.println(woo);


    }


}