class TV {

    boolean power;
    int channel;

    void power() { power = !power; }

    void channelUp() { ++channel; }

    void channelDown() { --channel; }
}

class CaptionTV extends TV {

    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {

        CaptionTV ctv = new CaptionTV();
        ctv.channel = 10;

        ctv.channelUp();
        System.out.println(ctv.channel);

        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}
