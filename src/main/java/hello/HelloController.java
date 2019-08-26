package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Properties;
import net.conjur.api.Conjur;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
	Conjur c = new Conjur();
	return	c.variables().retrieveSecret("secrets/frontend/aws_access_key");
    }
    
}
