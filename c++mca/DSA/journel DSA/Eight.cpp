#include <iostream>
#include <queue>

using namespace std;

struct TreeNode {
    int data;
    TreeNode* left;
    TreeNode* right;
};

TreeNode* createNode(int data) {
    TreeNode* newNode = new TreeNode;
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void insert(TreeNode** root, int data) {
    if (*root == NULL) {
        *root = createNode(data);
        return;
    }
    queue<TreeNode*> q;
    q.push(*root);
    while (!q.empty()) {
        TreeNode* temp = q.front();
        q.pop();
        if (temp->left != NULL) {
            q.push(temp->left);
        }
        else {
            temp->left = createNode(data);
            return;
        }
        if (temp->right != NULL) {
            q.push(temp->right);
        }
        else {
            temp->right = createNode(data);
            return;
        }
    }
}

int height(TreeNode* root) {
    if (root == NULL) {
        return 0;
    }
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);
    return max(leftHeight, rightHeight) + 1;
}

void printLeaves(TreeNode* root) {
    if (root == NULL) {
        return;
    }
    if (root->left == NULL && root->right == NULL) {
        cout << root->data << " ";
        return;
    }
    printLeaves(root->left);
    printLeaves(root->right);
}

void mirror(TreeNode* root) {
    if (root == NULL) {
        return;
    }
    mirror(root->left);
    mirror(root->right);
    TreeNode* temp = root->left;
    root->left = root->right;
    root->right = temp;
}

void printLevel(TreeNode* root, int level) {
    if (root == NULL) {
        return;
    }
    if (level == 1) {
        cout << root->data << " ";
    }
    else if (level > 1) {
        printLevel(root->left, level - 1);
        printLevel(root->right, level - 1);
    }
}

void printLevelOrder(TreeNode* root) {
    int h = height(root);
    for (int i = 1; i <= h; i++) {
        printLevel(root, i);
    }
}

int main() {
    TreeNode* root = NULL;
    insert(&root, 1);
    insert(&root, 2);
    insert(&root, 3);
    insert(&root, 4);
    insert(&root, 5);
    insert(&root, 6);
    insert(&root, 7);

    cout << "Original Tree: " << endl;
    printLevelOrder(root);

    int h = height(root);
    cout << "\nHeight of the tree: " << h << endl;

    cout << "Leaf nodes: ";
    printLeaves(root);
    cout << endl;

    mirror(root);

    cout << "Mirror Image: " << endl;
    printLevelOrder(root);

    return 0;
}
