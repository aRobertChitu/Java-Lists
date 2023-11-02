public class LinkedList <T> implements IList <T> {

    LinkedNode<T> root = new LinkedNode<>();

    public LinkedList() {
    }


    @Override
    public void insert(T t) {

        LinkedNode<T> currentNode = root;

        if(root.getValue() == null) {
            root.setValue(t);
            return;
        }

        while(currentNode.getNextNode()!=null){
            currentNode =  currentNode.getNextNode();
        }
        currentNode.setNextNode(new LinkedNode<>(t));
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T t) {

    }

    @Override
    public void display() {
        System.out.print("[");

        LinkedNode<T> currentNode = root;

        while(currentNode.getNextNode()!=null){
            System.out.print(currentNode.getValue());
            currentNode = currentNode.getNextNode();
            System.out.print(", ");
        }
        System.out.print(currentNode.getValue());

        System.out.print("]");
    }
}
