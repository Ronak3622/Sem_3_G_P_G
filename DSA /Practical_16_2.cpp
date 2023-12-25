// Practical 16_2 :- Implement algorithm to delete a node at the end in singly linked list.
#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;
};

void deleteEnd(Node **head){
    Node *tempNode = *head;
    Node *previous;

    if (*head == NULL){
        cout << ("\nEmpty List, can't delete");
        return;
    }

    if (tempNode->next == NULL){
        cout << "\nValue Deleted: " << (*head)->data;
        *head = NULL;
        return;
    }

    while (tempNode->next != NULL){
        previous = tempNode;
        tempNode = tempNode->next;
    }

    previous->next = NULL;
    cout << "\nValue Deleted: " << tempNode->data;
    delete (tempNode);
}

void insert(Node **head, int data){
    Node *newNode = new Node();
    newNode->data = data;
    newNode->next = *head;
    *head = newNode;
}

void display(Node *temp){
    cout << "\n\nLinked List: ";
    while (temp != NULL){
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

int main(){
    Node *head = NULL;
    insert(&head, 4);
    insert(&head, 5);
    insert(&head, 6);
    insert(&head, 7);
    insert(&head, 8);
    insert(&head, 9);
    insert(&head, 10);
    display(head);
    deleteEnd(&head);
    deleteEnd(&head);
    deleteEnd(&head);
    display(head);
    return 0;
}
/*
Output :-
Linked List: 10 9 8 7 6 5 4
Value Deleted: 4
Value Deleted: 5
Value Deleted: 6
Linked List: 10 9 8 7
*/
