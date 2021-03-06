package structures.queue;

/**
 * Created by m.losK on 2017-02-18.
 */
public interface Queue {
    void push(int value);

    int pop() throws QueueException;

    Queue clone();
}
