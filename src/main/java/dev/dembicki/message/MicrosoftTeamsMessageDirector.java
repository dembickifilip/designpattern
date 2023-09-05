package dev.dembicki.message;

public class MicrosoftTeamsMessageDirector {
        private MicrosoftTeamsMessageBuilder builder;

        public MicrosoftTeamsMessageDirector(MicrosoftTeamsMessageBuilder builder) {
                this.builder = builder;
        }

        public void constructMessage() {
                builder.ofType("MessageCard")
                                .with$schema("http://schema.org/extensions")
                                .withVersion("1.0")
                                .addTitle("Hello world")
                                .addDescription("This is a test message")
                                .addDescription("Test message")
                                .addImage("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
                                .addImage("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        }

        public MicrosoftTeamsMessage getResult() {
                return builder.build();
        }
}
