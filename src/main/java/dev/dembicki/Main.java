package dev.dembicki;

import java.util.List;

import dev.dembicki.cardelements.Image;
import dev.dembicki.finalElements.Description;
import dev.dembicki.finalElements.Title;

public class Main {
    public static void main(String[] args) {
        var message = new MicrosoftTeamsMessageBuilder()
                .ofType("AdaptiveCard")
                .with$schema("http://adaptivecards.io/schemas/adaptive-card.json")
                .withVersion("1.2")
                .withBody(List.of(
                        new Title("Hello World"),
                        new Description("This is a description"),
                        new Image("https://adaptivecards.io/content/cats/1.png")))
                .build();

        
        if (args.length == 0) {
            System.out.println("Please provide a webhook url");
            return;
        }
        message.sendTo(args[0]);
    }
}
