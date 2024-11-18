from collections import deque

def edge(adj, i, j):
    adj[i].append(j)
    adj[j].append(i)
    
def printMatrix(adj):
    for i in range(len(adj)):
        print(i, "->", end=" [ ")
        print(", ".join(map(str,(adj[i]))),end=" ")
        print("]")
        

def bfs(adj,s):
    
    queue=deque()
    
    visited=[False]*len(adj)
    visited[s]=True
    queue.append(s)
    
    while queue:
        cur=queue.popleft()
        print(cur,end=" ")
        
        
        for i in adj[cur]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True


n = 4
adj = [[] for _ in range(n)]

edge(adj, 0, 1)
edge(adj, 0, 2)
edge(adj, 1, 2)
edge(adj, 2, 3)

printMatrix(adj)

bfs(adj,0)