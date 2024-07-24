package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.*;

import java.util.HashMap;

import static base_url.ApiBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {
    Response response;

    @Given("send get request to getClientOptions")
    public void send_get_request_to_get_client_options() {
        spec.pathParams("p1", "api",
                "p2", "gen",
                "p3", "clients",
                "p4", "java"); //api/gen/clients/java

        response = given(spec).
                when().
                contentType(ContentType.JSON).
                get("{p1}/{p2}/{p3}/{p4}");
        //  response.prettyPrint();
    }

    @Then("verifies that status code is {int}")
    public void verifies_that_status_code_is(Integer int1) {
        // burada status codun 200 donup donmedigi hakkında assertion yapıyoruz.
        response.
                then().
                assertThat().
                statusCode(200);
    }

    @Given("send post request to getClientOptions")
    public void send_post_request_to_get_client_options() {
        spec.pathParams("p1", "api",
                "p2", "gen",
                "p3", "clients",
                "p4", "java"); //api/gen/clients/java
        HashMap<String,String> spec011 = new HashMap<>();
        HashMap<String,String> url = new HashMap<>();

        Options options = new Options("string", "string", "string");
        SecurityDefinition securityDefinition = new SecurityDefinition();
        AuthorizationValue authorizationValue = new AuthorizationValue("string", "string", "string", url);

        Root requestBody = new Root(spec011, options, "http://petstore.swagger.io/v2/swagger.json", authorizationValue, true, securityDefinition);



        response = given(spec).
                when().
                body(requestBody).
                contentType(ContentType.JSON).
                post("{p1}/{p2}/{p3}/{p4}");

    }

    @Then("verifies that status code is {int} post request")
    public void verifies_that_status_code_is_post_request(Integer expectedStatusCode) {
        System.out.println("Beklenen status code     ::::: " + expectedStatusCode);
        System.out.println("Gerçekleşen  status code ::::: " + response.getStatusCode());

        // burada status codun 200 donup donmedigi hakkında assertion yapıyoruz.
        response.
                then().
                assertThat().
                statusCode(200);

    }

}
