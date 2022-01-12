package io.slugstack.oss.standalone;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Standalone {



    Logger logger = LogManager.getLogger(Standalone.class);





    void method(String name) {
        logger.info("example " + name);
    }









    // bad formatting to ensure recipes are working as intended
}
