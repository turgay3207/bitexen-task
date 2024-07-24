package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class ApiBaseUrl {
    public static RequestSpecification spec;

    public static void setUp(){
        spec=new RequestSpecBuilder().
                setBaseUri("https://generator.swagger.io/").
                build();
    }

}
