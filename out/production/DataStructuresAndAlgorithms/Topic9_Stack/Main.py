class Stack:
    def __init__(self):
        self.numstack = []

    def push(self, data):
        self.numstack.append(data)
        print(f"Pushed {data} to stack")

    def pop(self):
        if self.is_empty():
            print("Stack Underflow: Cannot pop from an empty stack")
            return None
        return self.numstack.pop()

    def is_empty(self):
        return len(self.numstack) == 0

    def printstack(self):
        if self.is_empty():
            print("Stack is empty")
        else:
            print("Stack elements:", ' '.join(map(str, self.numstack)))

# Test the Stack
if __name__ == "__main__":
    numstack = Stack()

    # Test operations
    numstack.pop()  # Should print "Stack Underflow"
    numstack.push(1)
    numstack.push(2)
    numstack.push(3)
    print(f"Popped element: {numstack.pop()}")  # Should return and print 3

    numstack.printstack()  # Should print "Stack elements: 1 2"
