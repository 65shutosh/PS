package ktlin.leetcode.array

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for(num in nums){
        if(num in seen){
            return true
        }
        seen.add(num)
    }
    return false
}


fun singleNumber(nums: IntArray): Int {
    var seen = 0
    for (num in nums) {
        seen = seen xor num
    }
    return seen
}


fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val arr = IntArray(1001){0}
    val result = mutableListOf<Int>()
    for (num in nums1){
        arr[num]++
    }
    for (num in nums2){
        if (arr[num] > 0){
            arr[num] --
            result.add(num)
        }
    }
    return result.toIntArray()
}


fun plusOne(digits: IntArray): IntArray {
    if(digits.last()!=9){
        digits[digits.size -1] ++
        return digits
    }
    else{
        val temp = IntArray(digits.size+1)
        var remainder = 1
        for (i in digits.size-1 downTo 0){
            if(digits[i] == 9 && remainder == 1){
            temp[i]= 0
            }
            else{
                temp[i] = digits[i] + remainder
                remainder = 0
            }

        }
        return temp
    }
}