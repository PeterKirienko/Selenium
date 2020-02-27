package apiTests;

import apiMethods.GetAllUsersMethod;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class apiTests extends AbstractTest {

    @Test(description = "Get list all users")
    public void getListAllUsers() throws Exception {
        GetAllUsersMethod api = new GetAllUsersMethod("src/test/java/api/users/_post/rq.json",
                "src/test/java/api/users/_post/rs.json",
                "src/test/java/api/users/users.properties");
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test(description = "Get list all users with first_name contains ...")
    public void getUsersByFirstName() throws Exception {

    }

    @Test(description = "Create a new user")
    public void createNewUser() throws Exception {

    }

    @Test(description = "Return the details of the user with id")
    public void getUserDetails() throws Exception {

    }

}
