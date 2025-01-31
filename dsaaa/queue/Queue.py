class Queue:
    def __init__(self):
        self.queue =[]
        
    def enqueue(self , element):
        self.queue.append(element)
    def dequeue(self):
        if self.isEmpty():
            return "Queue is empty"
        return self.queue.pop(0)
    
    def peek(self):
        if self.isEmpty():
            return "Queue is empty"
        return self.queue[0]
  
    def isEmpty(self):
        return len(self.queue) == 0
    
    def size(self):
        return(self.queue)
    
q = Queue()
q.enqueue('a')
q.enqueue('b')
print(q.queue)
print(q.dequeue())
print(q.peek())
print(q.isEmpty())
print(q.size())