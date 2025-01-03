# Unexpected Behavior of removeIf and removeAll in Kotlin Lists

This repository demonstrates an uncommon error in Kotlin related to the `removeIf` and `removeAll` methods when used with predicates that modify the list during iteration.  The methods don't behave consistently which may lead to unexpected outcomes.

## Description
The core issue lies in the behavior of these methods when the predicate changes the size of the list (via `remove` or similar). The result is not guaranteed across different Kotlin versions or implementations, potentially leading to unexpected list modifications or runtime exceptions.

## How to Reproduce
The `Bug.kt` file contains a simple example that highlights the issue. The `removeIf` and `removeAll` functions are used to remove even numbers from a list. The output differs unexpectedly because `removeIf` does not alter the iteration order, whereas `removeAll` does.