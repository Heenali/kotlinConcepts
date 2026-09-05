package com.example.kotlinPractice.DS
//20 Ghandhinagar
//22 Banglore

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
fun inOrderTraversal(root: TreeNode?) {
    if (root != null) {
        inOrderTraversal(root.left)
        print("${root.value} ")
        inOrderTraversal(root.right)
    }
}
fun preOrderTraversal(root: TreeNode?) {
    if (root != null) {
        print("${root.value} ")
        preOrderTraversal(root.left)
        preOrderTraversal(root.right)
    }
}

fun postOrderTraversal(root: TreeNode?) {
    if (root != null) {
        postOrderTraversal(root.left)
        postOrderTraversal(root.right)
        print("${root.value} ")
    }
}

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)

    println("In-order traversal:")
    inOrderTraversal(root)

    println("\nPre-order traversal:")
    preOrderTraversal(root)

    println("\nPost-order traversal:")
    postOrderTraversal(root)
}
