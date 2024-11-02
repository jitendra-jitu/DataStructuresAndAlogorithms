if __name__ == "__main__":
    numstack = []

    numstack.append(4)
    numstack.append(8)
    numstack.append(15)
    numstack.append(16)

   
    print("Stack after pushes:", numstack)

   
    popped_element = numstack.pop()
    print(f"Popped: {popped_element}")


    if numstack: 
        print(f"Peek: {numstack[-1]}")
    else:
        print("Stack is empty, no element to peek")

    print("Stack after popping:", numstack)
