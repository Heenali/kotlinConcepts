package com.example.kotlinPractice.DS

class linkedListOperation(var value: Int)
{
    var next: linkedListOperation? = null
}
fun findTarget(head: linkedListOperation?, target: Int): Boolean {
    var current = head
    while (current != null) {
        if (current.value == target) {
            return true
        }
        current = current.next
    }
    return false
}
fun findTargetIndex(head: linkedListOperation?, target: Int): Int {
    var current = head
    var index = 0
    while (current != null) {
        if (current.value == target) {
            return index
        }
        current = current.next
        index++
    }
    return -1
}

fun sortList(head: linkedListOperation?): linkedListOperation? {
    if (head?.next == null) return head

    // Find middle
    var slow = head
    var fast = head
    var prev: linkedListOperation? = null

    while (fast != null && fast.next != null) {
        prev = slow
        slow = slow?.next
        fast = fast.next?.next
    }

    // Split into two halves
    prev?.next = null

    val left = sortList(head)
    val right = sortList(slow)

    return merge(left, right)
}

fun merge(l1: linkedListOperation?, l2: linkedListOperation?): linkedListOperation? {
    val dummy = linkedListOperation(0)
    var current = dummy

    var left = l1
    var right = l2

    while (left != null && right != null) {
        if (left.value < right.value) {
            current.next = left
            left = left.next
        } else {
            current.next = right
            right = right.next
        }
        current = current.next!!
    }

    current.next = left ?: right

    return dummy.next
}
fun main() {
    val head = linkedListOperation(10)
    head.next = linkedListOperation(20)
    head.next?.next = linkedListOperation(30)
    head.next?.next?.next = linkedListOperation(40)

    println(findTarget(head, 30)) // true
    println(findTarget(head, 50)) // false
    println(findTargetIndex(head,30))
    println(sortList(head)) // false
}


