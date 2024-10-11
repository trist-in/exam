package QuestionThree;

//TODO: Add the invariant to this class contract
/**
 *
 * GenericQueue class that implements a queue using a linked list. Queues follow the FIFO (First In First Out) principle.
 * Most queues follow the same general operations: enqueue (for adding elements), dequeue (for removing elements),
 * and peek (for viewing what is the next item to be removed without removing it).
 *
 * @param <E> the type of elements in the queue
 *
 * @invariant (size > 0, head != NULL, tail != NULL)
 */
public class GenericQueue <E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public GenericQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    //TODO: Write this method contract
    /**
     *Enqueues data into the queue.
     * @pre (data != NULL)
     *
     * @param E data, the data being enqueued.
     *
     * @post [New data node is enqueued, size is incremented.]
     *
     */
    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //TODO: Write this method contract
    /**
     *Removes the first data node from the queue.
     *
     * @pre (size > 0)
     * @post [First data node is removed, size is lowered, head node is pushed forward.]
     *
     * @return [Data at the dequeued node.]
     *
     */
    public E dequeue() {
        //Hint: There would normally be an if statement here if we weren't using D.B.C.
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public E peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    public static void printQueue(GenericQueue queue) {
        System.out.println(queue.toString());
    }
}
