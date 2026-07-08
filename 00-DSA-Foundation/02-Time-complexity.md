# Time Complexity & Big O Notation

## What is Time Complexity?

Initially, I thought Time Complexity means how many seconds a program takes to execute. But that's not correct.

Time Complexity measures **how the number of operations grows as the input size (n) increases**.

For example, if the same program runs on a gaming laptop and an old laptop, the execution time will be different because the hardware is different.

So, instead of measuring time in seconds, we measure the **number of operations** performed by the algorithm.

---

## What is Big O?

Big O tells us **how an algorithm grows as the input size grows**.

It doesn't tell the exact execution time.

It only tells how the number of operations increase when the input size becomes larger.

---

## Common Time Complexities

| Complexity |  Meaning         | Example                    |
|------------|------------------|----------------------------|
| O(1)       | Constant Time    | Accessing an array element |
| O(log n)   | Logarithmic Time | Binary Search              |
| O(n)       | Linear Time      | Linear Search              |
| O(n²)      | Quadratic Time   | Nested Loops               |

---

## Examples

### O(1) - Constant Time

The number of operations never changes even if the input size increases.

```python
arr = [10, 20, 30]
print(arr[0])
```

Whether the array has 3 elements or 3 million elements, Accessing any element in an array by its index takes one operation.

---

### O(n) - Linear Time

The number of operations increases linearly with the input size.

```python
for i in arr:
    print(i)
```

- 10 elements → 10 iterations
- 100 elements → 100 iterations
- 1000 elements → 1000 iterations

---

### O(n²) - Quadratic Time

This usually happens when we use nested loops.

```python
for i in arr:
    for j in arr:
        print(i, j)
```

- n = 5 → 25 operations
- n = 100 → 10,000 operations

---

### O(log n) - Logarithmic Time

Binary Search follows this time complexity.

Instead of checking every element, it divides the search space into half after every step.

This makes it much faster than Linear Search for large inputs.

---

## Growth Order

```text
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(2ⁿ)
O(n!)
```

As we move down the list, the algorithm becomes less efficient for large inputs.

---

## Key Takeaways

- Time Complexity measures the growth of operations, not execution time.
- Big O describes how an algorithm scales as the input size increases.
- O(1) is generally the fastest.
- O(log n) is very efficient for large inputs.
- O(n²) is slower because the number of operations grows much faster.