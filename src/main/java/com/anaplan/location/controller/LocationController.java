package com.uday.location.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class LocationController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static List<String> locations;
    private static Map<String, String> env;

    static {
        locations = new ArrayList<String>() {{
            add("San Francisco");
            add("Minneapolis");
            add("New York");
            add("Boston");
            add("Amsterdam");
            add("Amsterdam");
            add("London");
            add("Lausanne");
            add("Maidenhead");
            add("Moscow");
            add("Frankfurt");
            add("Paris");
            add("Stockholm");
            add("‘s-Hertogenbosch");
            add("Vienna");
            add("York");
            add("Melbourne");
            add("Mumbai");
            add("Singapore");
            add("Sydney");
            add("Tokyo");
        }};
        env = System.getenv();
    }

    /**
     * Get current location
     *
     * @return return current location
     */
    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public String location(){
        String dataCenter = env.get("DC_NAME");
        String cluster = env.get("CLUSTER_NAME");
        String verion = env.get("VERSION");
        String currentLocation = locations.get((int)(Math.random()*(locations.size())));
        String responseOut = dataCenter + "-" + cluster + "-"+verion + "-"+ "My current location is: "+ currentLocation;
        logger.info(responseOut);
        return responseOut;
    }
}
