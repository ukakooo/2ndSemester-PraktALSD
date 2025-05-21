|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020215|
| Nama |  Herconary Angga |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/ukakooo/2ndSemester-PraktALSD) |

# Labs #13 Double Linked List

## 2.1. Experiment 1

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot](src/Exp1/1.png)

**Brief explanaton:**
1. 

**Questions:**
1. Explain the difference between a singly linked list and a double linked list.  

    Double linked list can go bi-directional. It can go to next and previous (`next` and `prev`) to access nodes. Whilst Single linked list can only go one direction, which is `next`.

2. Observe the `Node` class, which contains the attributes `next` and `prev`. What are the purposes of these attributes?
3. Examine the constructor in the `DoubleLinkedLists` class. What is the purpose of this constructor?   
    ```
    DoubleLinkedLists() {
        head = null;
        tail = null;
    }
    ```

4. In the `addFirst()` method, what is the meaning of the following code?  
    ```
    if (isEmpty()) {
            head = tail = newNode;
        }
    ```

5. In the `addFirst()` method, what does the statement `head.prev = newNode` mean?
6. In the `insertAfter()` method, what is the meaning of `current.next.prev = newNode`?
7. In the experiment 1 code, in which method the traversal process implemented? What is the meaning of `temp = temp.next`?
8. In the `insertAfter()` method, what is the following code for?  
    ```
    if (temp == tail) {
        addLast(data);
    }
    ```

9. In the `insertAfter()` what is this statement `if(temp.data.nim.equalsIgnoreCase(key))` for?

## 2.1.1. Selection Solution
Continue to report the result....
