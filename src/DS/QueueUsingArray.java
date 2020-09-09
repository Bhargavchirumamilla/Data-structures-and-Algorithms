package DS;

public class QueueUsingArray {
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;

	QueueUsingArray(int sizeofQueue) {
		this.capacity = sizeofQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		}
		return false;
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("May be queue is full,can not insert the data");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = element;
			currentSize++;
			System.out.println(element + " : added To queue");

		}
	}

	public void dqueue() {
		if (isEmpty()) {
			System.out.println("Hey queue us emapty, can not delete element");

		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " : removed first element from the Queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + ": removed first element from the Queue");
			}
			currentSize--;
		}

	}

	public static void main(String[] args) {
		QueueUsingArray obj = new QueueUsingArray(20);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(500);
		obj.dqueue();
		obj.dqueue();
		obj.enqueue(900);
		obj.enqueue(1000);
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
		obj.dqueue();
	}

}
