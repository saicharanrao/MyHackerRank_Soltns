/*
A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

A Node insert function is also declared in your editor. It has two parameters: a pointer, , pointing to the first node of a linked list, and an integer  value that must be added to the end of the list as a new Node object.

Task 
Complete the insert function in your editor so that it creates a new Node (pass  as the Node constructor argument) and inserts it at the tail of the linked list referenced by the  parameter. Once the new node is added, return the reference to the  node.

Note: If the  argument passed to the insert function is null, then the initial list is empty.

Input Format

The insert function has  parameters: a pointer to a Node named , and an integer value, . 
The constructor for Node has  parameter: an integer value for the  field.

You do not need to read anything from stdin.

Output Format

Your insert function should return a reference to the  node of the linked list.

Sample Input

The following input is handled for you by the locked code in the editor: 
The first line contains T, the number of test cases. 
The  subsequent lines of test cases each contain an integer to be inserted at the list's tail.

4
2
3
4
1
Sample Output

The locked code in your editor prints the ordered data values for each element in your list as a single line of space-separated integers:

2 3 4 1
*/

      Node* insert(Node *head,int data)
      {
          
          
          Node *temp11 = new Node(0);
    temp11->data = data;
    temp11->next = NULL;
    // if the linked list is empty then set head = temp11
    if (head == NULL) {
        head = temp11;
    } else { // if the linked list is not empty
        // creates a temp node and sets it to head
        Node *temp = new Node(0);
        temp = head;
        // uses temp to find the temp11 node
        // Why do we have to use temp->next here instead of temp? wouldn't it be the same?
        while (temp->next != NULL) {
            temp = temp->next;
        }
        // appends the temp11 node with temp11
        temp->next = temp11;
    }
    // returns head of linked list
    return head;
      }