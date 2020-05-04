package troweprice;

public class Word {

    private final String content;

    Word(final String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public int getLength() {
        return this.content.length();
    }
}
