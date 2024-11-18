def edge(adj,i,j):
    adj[i].append(j)
    adj[j].append(i)
    

def printMatrix(adj):
    
    for i in range(len(adj)):
        print(i,"->",end=" ")
        for j in adj[i]:
            print(j,end=" ")
        print()


n=4
adj=[[] for _ in range(n)]

edge(adj,0,1)
edge(adj,0,2)
edge(adj,1,2)
edge(adj,2,3)

printMatrix(adj)