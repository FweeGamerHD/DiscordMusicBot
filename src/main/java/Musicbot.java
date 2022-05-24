import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Musicbot extends ListenerAdapter {

    public static void main(String[] args) throws Exception {

        Secretstuff secretstuff = new Secretstuff();

        JDA bot = JDABuilder.createDefault(secretstuff.getToken())
                .addEventListeners(new Musicbot())
                .setActivity(Activity.listening("to p!"))
                .build();
    }

}