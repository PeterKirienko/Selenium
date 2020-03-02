package apiTests;

import apiMethods.PatchUserMethod;
import apiMethods.PostUserMethod;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class apiPatchTests extends AbstractTest {

    @Test(description = "Create a new user")
    public void testPatchtUser() {
        PatchUserMethod api = new PatchUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }
}
