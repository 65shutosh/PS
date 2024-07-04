package ktlin.leetcode.array

fun rotate(nums: IntArray, k: Int): Unit {
    repeat(k){
        val tempLastElement = nums.last()
        for(i in nums.size-1  downTo 1){
            nums[i] = nums[i-1]
        }
        nums[0] = tempLastElement
    }
}