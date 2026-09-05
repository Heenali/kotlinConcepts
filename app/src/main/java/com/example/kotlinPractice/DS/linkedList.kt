package com.example.kotlinPractice.DS

class ListNode(var value: Int) {
    var next: ListNode? = null
}
class SinglyLinkedList {
    var head: ListNode? = null

    // Insertion operation to add a new node at the end of the list
    fun insert(value: Int) {
        val newNode = ListNode(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    // Deletion operation to remove a node from the list
    fun delete(value: Int) {
        if (head == null) return

        if (head!!.value == value) {
            head = head!!.next
            return
        }

        var prev: ListNode? = null
        var current = head
        while (current != null && current.value != value) {
            prev = current
            current = current.next
        }

        prev?.next = current?.next
    }

    // Finding the middle element of the list
    fun findMiddle(): ListNode? {
        var slow = head
        var fast = head

        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
    }
}

fun main() {
    val linkedList = SinglyLinkedList()

    // Insert elements into the linked list
    linkedList.insert(1)
    linkedList.insert(2)
    linkedList.insert(3)
    linkedList.insert(4)
    linkedList.insert(5)

    // Display the linked list
    printLinkedList(linkedList.head) // Output: 1 -> 2 -> 3 -> 4 -> 5

    // Delete an element from the linked list
    linkedList.delete(3)

    // Display the linked list after deletion
    printLinkedList(linkedList.head) // Output: 1 -> 2 -> 4 -> 5

    // Find the middle element of the linked list
    val middleNode = linkedList.findMiddle()
    println("Middle element: ${middleNode?.value}") // Output: Middle element: 2
}
fun printLinkedList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.value} -> ")
        current = current.next
    }
    println("null")
}
