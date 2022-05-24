import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Musicbot {

    // Main method
    public static void main(String[] args) throws LoginException {

        Secretstuff secretstuff = new Secretstuff();

        JDA bot = JDABuilder.createDefault(secretstuff.getToken())
                .setActivity(Activity.listening("to p!"))
                .build();
    }
}