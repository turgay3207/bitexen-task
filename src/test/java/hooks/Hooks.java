package hooks;

import io.cucumber.java.Before;

import static base_url.ApiBaseUrl.setUp;

public class Hooks {
    @Before()
    public void before(){
        setUp();
    }

}
