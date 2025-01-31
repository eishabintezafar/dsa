class queueusingstack:
    def __init__(self):
        self.s1= []
        self.s2= []
    def enqueue(self ,x):
        self.s1.append(x)
    def dequeue(self):
        if not self.s2:
            while self.s1:
                self.s2.append(self.s1.pop())
                
        if not self.s2:
            return "queue is empty"
        return self.s2.pop()
    
    def front(self):
        if not self.s2:
            self.s2.append(self.s1.pop())
        if not self.s2:
            return "queue is empty"
        return self.s2[-1]
    def is_empty(self):
        return not self.s1 and not self.s2
queue = queueusingstack()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

print(queue.front())  # Output: 10
print(queue.dequeue())  # Output: 10
print(queue.dequeue())  # Output: 20
print(queue.is_empty())  # Output: False
print(queue.dequeue())  # Output: 30
print(queue.is_empty())