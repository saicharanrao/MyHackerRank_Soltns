/*
  Merge two sorted lists A and B as one linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* MergeLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method 
    
    
    //If any list is null then return the other list back.
    // Start the list with the one that has the lowest value
    if(headA==NULL)return headB;
    if(headB==NULL)return headA;
    
    Node* head;
    
    if(headA->data < headB->data)
        head = headA;
    else {
        head = headB;
        headB = headA;
        headA = head;
    }
    
    //1) Check if the next value is greater than headB value
    //2) if so swap the values
    
    while(headA->next != NULL) {
    if (headA->next->data > headB->data) {
      Node* tmp = headA->next;
      headA->next = headB;
      headB = tmp;
    }
    headA = headA->next;
  } 
  if (headA->next == NULL) headA->next = headB;
  return head;
    
    
    
}
