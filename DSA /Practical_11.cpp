// Practical No. 11 :- Implement insertion of node at the end of the list in singly linked list.

#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;
};
void insertEnd(Node **head, int data){
    Node *freshNode = new Node();
    freshNode->data = data;
    freshNode->next = NULL;
    if (*head == NULL)
    {
        *head = freshNode;
        cout << freshNode->data << " inserted" << endl;
        return;
    }
    struct Node *temp = *head;
    while (temp->next != NULL)
        temp = temp->next;
    temp->next = freshNode;
    cout << freshNode->data << " inserted" << endl;
}
void display(Node *node){
    while (node != NULL)
    {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
}
int main(){
    Node *head = NULL;
    insertEnd(&head, 7);
    insertEnd(&head, 8);
    insertEnd(&head, 9);
    insertEnd(&head, 10);
    display(head);
    return 0;
}

/*
Output :-
7 inserted
8 inserted
9 inserted
10 inserted
7 8 9 10
*/
