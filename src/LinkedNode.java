import java.util.Objects;

public class LinkedNode <T> extends Node <T> {

    private LinkedNode<T> next;

    public LinkedNode() {
        // default, empty
    }

    public LinkedNode(T value, LinkedNode<T> next) {
        super(value);
        this.next = next;
    }

    public LinkedNode(T value) {
        super(value);
    }

    public LinkedNode<T> getNextNode() {
        return next;
    }

    public void setNextNode(LinkedNode<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedNode<?> that = (LinkedNode<?>) o;
        return Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next);
    }
}
