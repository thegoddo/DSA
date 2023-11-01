#include <stdio.h>
#include <stdlib.h>

struct ListNode {
  int data;
  struct ListNode *next;
};

int ListLength(struct ListNode *head) {
  struct ListNode *current = head;
  int count = 0;

  while(current != NULL) {
    count++;
    current = current->next;
  }

  return count;
}

void insertInLinkedList(struct ListNode **head, int data, int position) {
  int k = 1;
  struct ListNode *p, *q, *newNode;
  newNode = (struct ListNode *)malloc(sizeof(struct ListNode));

  if(!newNode) {
    printf("Memory Error!!!");
    return;
  }

  newNode->data = data;
  p = *head;
  // Inserting at the beginning
  if(position == 1) {
  newNode->next = p;
  *head = newNode;
  } else {
    // Traverse till we find the position
    while((p!=NULL) && (k<position)) {
      k++;
      q=p;
      p=p->next;
    }
    q->next=newNode;
    newNode->next=p;
  }
}

void DeleteNodeFromLinkedList(struct ListNode **head, int position) {
  int k = 1;
  struct ListNode *p, *q;
  if(*head == NULL) {
    printf("List Empty");
    return;
  }
  p = *head;
  /* From the Beginning */
  if(position == 1) {
    *head = (*head)->next;
    free(p);
    return;
  } else {
    // Traversing the list untill we find the node we want to delete.
    while((p != NULL)&&(k < position)) {
      k++;
      q = p;
      p = p->next;
    }
    if(p == NULL) {
      printf("Position Does not Exist");
    } else {
      q->next = p->next;
      free(p);
    }
  }
}

void DeleteLinkedList(struct ListNode **head) {
  struct ListNode *auxiliaryNode, *iterator;
  iterator = *head;
  while(iterator) {
    auxiliaryNode = iterator->next;
    free(iterator);
    iterator = auxiliaryNode;
  }
  *head = NULL;
}

int main() {
  
}
