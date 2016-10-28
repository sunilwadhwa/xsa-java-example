package tinyworld.tinyjava.tinyweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tinyworld.tinyjava.tinyweb.model.Country;

@RestController
@RequestMapping("/")
public class TinyWebController {
	    @RequestMapping(method = RequestMethod.GET)
	    public Country getCountry() {
	        return new Country("Spain", "Europe");
	    }
}
