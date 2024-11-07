
# Two Pointers Technique

```
 Two pointers is really an easy and effective technique that is typically used for Two Sum in Sorted Arrays, Closest Two Sum, Three Sum, Four Sum, Trapping Rain Water and many other popular interview questions. Given a sorted array arr (sorted in ascending order) and a target, find if there exists any pair of elements (arr[i], arr[j]) such that their sum is equal to the target.
 ```


# Algorithm

```
def twoSum(numbers, target):
    left, right = 0, len(numbers) - 1

    while left < right:
        current_sum = numbers[left] + numbers[right]
        # If current sum = target, return left and right
        if current_sum == target:
            return [left + 1, right + 1]
        # If current sum < target, then increase the current sum by moving the left 
        # pointer by 1
        elif current_sum < target:
            left += 1
        else:
            # If current sum > target, then decrease the current sum by 
            # moving the right pointer by 1
            right -= 1

    return []
```


# Example usage
numbers = [2, 7, 11, 15]
target = 9
print(twoSum(numbers, target))