package apiTests;

import apiMethods.DeleteUserMethod;
import apiMethods.PostUserMethod;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class apiDeleteTests extends AbstractTest {

    @Test(description = "Create a new user")
    public void testDeleteUser() {
        DeleteUserMethod api = new DeleteUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }
}
