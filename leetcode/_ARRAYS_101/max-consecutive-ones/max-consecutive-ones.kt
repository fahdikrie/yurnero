class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var counter = 0
        var max = 0

        nums.forEach {
            if (it == 1) counter++
            else counter = 0

            if (counter > max) max = counter
        }

        return max
    }
}