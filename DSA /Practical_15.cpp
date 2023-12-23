// Practical No. 15 :-  Implement searching of a node in linked list
#include <iostream>
using namespace std;

struct Node{
    int data;
    Node *next;
};

Node *search(Node *head, int x){
    Node *current = head;
    while (current != NULL){
        if (current->data == x){
            return current;
        }
        current = current->next;
    }
    return NULL;
}

int main(){
    Node *head = new Node();
    head->data = 1;
    head->next = new Node();
    head->next->data = 2;
    head->next->next = new Node();
    head->next->next->data = 3;
    head->next->next->next = new Node();
    head->next->next->next->data = 4;

    int x = 4;
    Node *node = search(head, x);
    if (node == NULL){
        cout << "Node not found" << endl;
    }
    else{
        cout << "Node found: " << node->data << endl;
    }

    return 0;
}

/*
Output :-
Node found : 4
*/
