package model;

public class Channel {

    private int channelId;
    private String channelName;
    private String channelType;
    private String platform;

    public Channel() {
    }

    public Channel(int channelId, String channelName,
                   String channelType, String platform) {

        this.channelId = channelId;
        this.channelName = channelName;
        this.channelType = channelType;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return channelName + " - " + platform;
    }
}