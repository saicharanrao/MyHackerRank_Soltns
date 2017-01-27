unsigned int binarytree_count_recursive(const btnode *root)
{
    unsigned int count = 1;
    if (root->left != NULL) {
       count += binarytree_count_recursive(root->left);
    }
    if (root->right != NULL) {
        count += binarytree_count_recursive(root->right);
    }
    return count;
}
 
unsigned int binarytree_count(const binarytree *tree)
{
    unsigned int count = 0;
    if (tree->root != NULL) {
        count = binarytree_count_recursive(tree->root);
    }
    return count;
}