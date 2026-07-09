public class ComparableBook implements Comparable<ComparableBook> {
    private int id;
    private String title;

    public ComparableBook(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int compareTo(ComparableBook other) {
        // Natural ordering based on ID (Ascending)
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + title;
    }
}