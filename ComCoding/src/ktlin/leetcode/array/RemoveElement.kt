package ktlin.leetcode.array

fun removeElement(nums: IntArray, data: Int): Int {
    var i = 0
    var j = nums.size -1
    while (i <= j){
        if(nums[i] == data){
            if (nums[j] != data){
                nums[i] = nums[j]
                i++
            }
            else {
                continue
            }
            j--
        }
        else{
            i++
        }
    }
    return if(j==nums.size -1 ) i else i-1
}