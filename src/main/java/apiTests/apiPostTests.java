package apiTests;

import apiMethods.PostUserMethod;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class apiPostTests extends AbstractTest {

    @Test(description = "Create a new user")
    public void testPostUser() {
        PostUserMethod api = new PostUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }
}
