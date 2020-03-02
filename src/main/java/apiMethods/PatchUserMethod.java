package apiMethods;

import apiMethods.utils.PropertiesParser;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class PatchUserMethod  extends AbstractApiMethodV2 {
    public PatchUserMethod() {
        super("api/users/_patch/rq.json", "api/users/_patch/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        PropertiesParser propertiesParser = new PropertiesParser();
        final String token = propertiesParser.getPropertyByName("access-token", "usersApi.properties");
        this.setHeaders("Authorization=" + token);
    }
}
