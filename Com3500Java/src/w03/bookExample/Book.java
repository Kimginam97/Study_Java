package w03.bookExample;

public final class Book {
    private final int id;
    private final String title;

    public Book(final int id, final String title) {
        this.id = id;
        this.title = title;
    }

    public int getID() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }
}
