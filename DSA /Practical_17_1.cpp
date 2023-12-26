// Practical No. 17_1 Implement construction of BST.
#include <iostream>
using namespace std;
struct TreeNode{
    int data;
    TreeNode *left;
    TreeNode *right;

    TreeNode(int value) : data(value), left('\0'), right('\0') {}
};

class BinarySearchTree{ 
private:
    TreeNode *root;

    TreeNode *insert(TreeNode *root, int value){
        if (root == '\0'){
            return new TreeNode(value);
        }

        if (value < root->data){
            root->left = insert(root->left, value);
        }
        else if (value > root->data){
            root->right = insert(root->right, value);
        }

        return root;
    }

    void inOrderTraversal(TreeNode *root){
        if (root != '\0'){
            inOrderTraversal(root->left);
            cout << root->data << " ";
            inOrderTraversal(root->right);
        }
    }

public:
    BinarySearchTree() : root('\0') {}
    void insert(int value){
        root = insert(root, value);
    }

    void inOrderTraversal(){
        inOrderTraversal(root);
        cout << endl;
    }
};

int main(){
    BinarySearchTree bst;
    bst.insert(50);
    bst.insert(30);
    bst.insert(70);
    bst.insert(20);
    bst.insert(40);
    bst.insert(60);
    bst.insert(80);
    cout << "In-order traversal of the BST: ";
    bst.inOrderTraversal();
    return 0;
}

/*
Output :-
In-order traversal of the BST: 20 30 40 50 60 70 80
*/
