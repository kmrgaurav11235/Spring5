package in.gaurav;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven {

    private static final Logger log = LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        log.info("Hello Info.");
        log.debug("Hello Debug.");
    }
}
