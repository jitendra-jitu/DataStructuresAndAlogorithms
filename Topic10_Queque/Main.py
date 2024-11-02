class Queue:
    def __init__(self, capacity):
        self.queue = [None] * capacity
        self.front = 0
        self.rear = -1
        self.size = 0
        self.capacity = capacity

    def enqueue(self, data):
        if self.is_full():
            raise QueueFullError("Queue is full!")
        self.rear = (self.rear + 1) % self.capacity
        self.queue[self.rear] = data
        self.size += 1

    def dequeue(self):
        if self.is_empty():
            raise QueueEmptyError("Queue is empty!")
        data = self.queue[self.front]
        self.front = (self.front + 1) % self.capacity
        self.size -= 1
        return data

    def peek(self):
        if self.is_empty():
            raise QueueEmptyError("Queue is empty!")
        return self.queue[self.front]

    def is_empty(self):
        return self.size == 0

    def is_full(self):
        return self.size == self.capacity

    def print_queue(self):
        if self.is_empty():
            print("Queue is empty")
        else:
            print("Queue elements:", *self.queue[self.front:(self.front + self.size) % self.capacity])


class QueueFullError(Exception):
    pass

class QueueEmptyError(Exception):
    pass

if __name__ == "__main__":
    queue = Queue(5)

    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)
    queue.enqueue(40)
    queue.enqueue(50)

    print("Peek:", queue.peek())

    queue.dequeue()
    queue.dequeue()

    queue.enqueue(60)
    queue.enqueue(70)

    queue.print_queue()