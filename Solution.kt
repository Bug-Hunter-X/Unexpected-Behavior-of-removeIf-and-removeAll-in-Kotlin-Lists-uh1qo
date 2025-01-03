The best solution is to create a new list containing only the elements that satisfy the condition, rather than modifying the list in place during iteration.

```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }
    println(filteredList) // Output: [1, 3, 5]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val filteredList2 = list2.filterNot { it % 2 == 0 }
    println(filteredList2) // Output: [1, 3, 5]
}
```
This approach avoids the unexpected behavior and ensures consistent results across different Kotlin implementations.