package week5;
import java.util.ArrayList;
import java.util.Iterator;
class RadioChannel {
    private String name;
    private String type;

    public RadioChannel(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

interface ChannelCollection {
    Iterator<RadioChannel> iterator(String type);
}

class ChannelCollectionImpl implements ChannelCollection {
    private ArrayList<RadioChannel> channels;

    public ChannelCollectionImpl() {
        channels = new ArrayList<>();
        channels.add(new RadioChannel("BBC Radio 1", "English"));
        channels.add(new RadioChannel("Channel 4 Extra", "English"));
        channels.add(new RadioChannel("France Info", "French"));
        channels.add(new RadioChannel("Radio Nacional de España", "Spanish"));
    }

    @Override
    public Iterator<RadioChannel> iterator(String type) {
        return new ChannelIterator(channels, type);
    }
}

class ChannelIterator implements Iterator<RadioChannel> {
    private ArrayList<RadioChannel> channels;
    private String type;
    private int position = 0;

    public ChannelIterator(ArrayList<RadioChannel> channels, String type) {
        this.channels = channels;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            if (channels.get(position).getType().equals(type)) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public RadioChannel next() {
        return channels.get(position++);
    }
}

public class postLab {
    public static void main(String[] args) {
        // Get the channel collection
        ChannelCollection channelCollection = new ChannelCollectionImpl();

        // Create an iterator for English channels
        Iterator<RadioChannel> englishChannelIterator = channelCollection.iterator("English");

        // Iterate through the English channels
        while (englishChannelIterator.hasNext()) {
            RadioChannel channel = englishChannelIterator.next();
            System.out.println(channel.getName());
        }
    }
}
