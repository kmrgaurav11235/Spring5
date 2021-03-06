package in.gaurav;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess the number game.");

        // Create Context (Container)
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        final NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);

        // Get a random number
        int number = numberGenerator.next();

        // Log the generated number
        log.info("number = {}", number);

        // Close Context (Container)
        context.close();
    }
}
