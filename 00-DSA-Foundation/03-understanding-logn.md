# Day 2 - Understanding O(log n)

### Step 1: What happens in Binary Search?

Suppose we have **16 elements**.

```text
16
```

In Binary Search, the search space is divided into half after every step.

```text
16 → 8
8 → 4
4 → 2
2 → 1
```

The search stops when only one element remains.

So, for 16 elements, we divided the search space **4 times**.

---

### Step 2: Writing it Mathematically

Let the initial size be **n**.

After every division, the size becomes:

```text
Step 0 : n
Step 1 : n / 2
Step 2 : n / 4
Step 3 : n / 8
Step 4 : n / 16
...
```

Suppose it takes **k** divisions to reach one element.

Then the remaining size is:

```text
n / 2ᵏ
```

Since the algorithm stops when only one element is left,

```text
n / 2ᵏ = 1
```

Multiplying both sides by `2ᵏ`,

```text
n = 2ᵏ
```

Taking logarithm with base 2 on both sides,

```text
k = log₂(n)
```

This means the number of divisions required is **log₂(n)**.

Therefore, the time complexity of Binary Search is:

```text
O(log n)
```

---

## Example 1

Suppose,

```text
n = 16
```

Question:

**How many times should we multiply 2 to get 16?**

```text
2¹ = 2
2² = 4
2³ = 8
2⁴ = 16
```

So,

```text
log₂16 = 4
```

---

## Example 2

Suppose,

```text
n = 32
```

Binary Search works like this:

```text
32 → 16 → 8 → 4 → 2 → 1
```

There are **5 divisions**.

Mathematically,

```text
2⁵ = 32
```

Therefore,

```text
log₂32 = 5
```

---

## How I Understood It

Binary Search keeps dividing the input by **2** until only **1** element remains.

So I asked myself:

> **"How many times can I divide the input by 2 before I reach 1?"**

Mathematically, this is the same as asking:

> **"How many times should I multiply 2 to get n?"**

The answer is:

```text
log₂(n)
```

That is why Binary Search has a time complexity of:

```text
O(log n)
```