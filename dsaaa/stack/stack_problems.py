class Node:
    def __init__(self ,v):
        self.data=v
        self.next=None
class SLL:
    def __init__(self):
        self.head=None
def prepend(self, v):
    n=Node(v)
    if self.head:
        n.next=self.head
        self.head=n
    else:
        self.head=n
def print(self):
    c = self.head
    while c:
        print(c.data)
        c = c.next
    class Stack:
     def __init__(self):
        self.sll = SLL()
        self.count = 0
def push(self, v):
        self.sll.prepend(v)
        self.count += 1       
