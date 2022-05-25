package io.github.FweeGamerHD.DiscordMusicBot;

import io.github.FweeGamerHD.DiscordMusicBot.Commands.Command;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Map;

public class Musicbot extends ListenerAdapter {

    private static final Map<String, Command> commands = new HashMap<>();

    static {
        commands.put("p! help", event -> event.getMessage().getChannel()
                .flatMap(channel -> channel.createMessage("Pong!"))
                .then());
        /*commands.put("pause", new StopCommand());
        commands.put("queue", new QueueCommand());
        commands.put("help", new HelpCommand());*/
    }
    public static void main(String[] args) throws Exception {

        Secretstuff secretstuff = new Secretstuff();

        JDA bot = JDABuilder.createDefault(secretstuff.getToken())
                .addEventListeners(new Musicbot())
                .setActivity(Activity.listening("to p! help"))
                .build();


    }

}