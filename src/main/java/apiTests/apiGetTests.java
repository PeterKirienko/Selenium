package apiTests;

import apiMethods.GetUserMethods;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class apiGetTests extends AbstractTest {
    @Test(description = "Get list all users")
    public void getListAllUsers() {
        GetUserMethod getUserMethod = new GetUserMethod();
        GetAllUsersMethod api = getUserMethod;
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }

    @Test(description = "Get user by phone")
    public void testGetUserByPhone() {
        GetAllUsersMethod api =  new GetUserMethod();
        api.setMethodPath(api.getMethodPath() + "?phone=375296598546");
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }

    @Test(description = "Get user by Id")
    public void testGetUserById() {
        GetAllUsersMethod api =  new GetUserMethod();
        api.setMethodPath(api.getMethodPath() + "/42");
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }

    @Test(description = "Get page")
    public void testGetUserById() {
        GetAllUsersMethod api =  new GetUserMethod();
        api.setMethodPath(api.getMethodPath() + "?page=5");
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }


}
