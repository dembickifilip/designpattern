package dev.dembicki;

import dev.dembicki.message.MicrosoftTeamsMessage;
import dev.dembicki.message.MicrosoftTeamsMessageConcreteBuilder;
import dev.dembicki.message.MicrosoftTeamsMessageDirector;

public class Main {
    public static void main(String[] args) {
        MicrosoftTeamsMessageDirector director = new MicrosoftTeamsMessageDirector(new MicrosoftTeamsMessageConcreteBuilder());

        director.constructMessage();
        MicrosoftTeamsMessage message = director.getResult();

        if (args.length == 0) {
            System.out.println("Podaj URL webhooka");
            return;
        }
        message.sendTo(args[0]);
    }
}
