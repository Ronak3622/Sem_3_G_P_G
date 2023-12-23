// Practical No. 13 :- Implement insertion of node in sorted linked list
#include <iostream>
using namespace std;

struct Node{
    int data;
    Node *next;
};

class LinkedList{
private:
    Node *head;

public:
    LinkedList(){
        head = nullptr;
    }

    void insertAt(int position, int data){
        if (position < 0 || position > size()){
            return;
        }

        Node *newNode = new Node();
        newNode->data = data;

        if (position == 0){
            newNode->next = head;
            head = newNode;
            return;
        }

        Node *temp = head;
        for (int i = 0; i < position - 1; i++){
            temp = temp->next;
        }

        newNode->next = temp->next;
        temp->next = newNode;
    }

    int size(){
        int count = 0;
        Node *temp = head;
        while (temp != nullptr){
            count++;
            temp = temp->next;
        }
        return count;
    }

    void print(){
        Node *temp = head;
        while (temp != nullptr){
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
};

int main(){
    LinkedList list;
    list.insertAt(0, 1);
    list.insertAt(1, 5);
    list.insertAt(2, 3);
    list.insertAt(3, 4);
    list.insertAt(4, 7);
    list.print(); // 1 2 3 4

    return 0;
}

/*
Output :- 
1 5 3 4 7
*/
