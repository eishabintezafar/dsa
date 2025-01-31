from queue import Queue

class StackUsingQueues:
    def __init__(self):
        self.q1 = Queue()
        self.q2 = Queue()

    def push(self, x):
        self.q1.put(x)

    def pop(self):
        if self.q1.empty():
            return "Stack is empty"

        while self.q1.qsize() > 1:
            self.q2.put(self.q1.get())

        popped_item = self.q1.get()
        self.q1, self.q2 = self.q2, self.q1

        return popped_item

    def top(self):
        if self.q1.empty():
            return "Stack is empty"

        while self.q1.qsize() > 1:
            self.q2.put(self.q1.get())

        top_item = self.q1.get()
        self.q2.put(top_item)
        self.q1, self.q2 = self.q2, self.q1

        return top_item

    def is_empty(self):
        return self.q1.empty()

stack = StackUsingQueues()
stack.push(10)
stack.push(20)
stack.push(30)

print(stack.top())
print(stack.pop())
print(stack.pop())
print(stack.is_empty())
print(stack.pop())
print(stack.is_empty())
