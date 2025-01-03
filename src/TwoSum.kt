class TwoSum {

    // Approach 1: Brute Force
    fun approach1(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No solution found")
    }

    // Approach 2: HashMap for Efficient Lookup
    fun secondApproach(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (hashMap.containsKey(complement)) {
                return intArrayOf(hashMap[complement]!!, i)
            }
            hashMap[nums[i]] = i
        }
        throw IllegalArgumentException("No solution found")
    }
}

fun main() {
    val twoSum = TwoSum()
    val nums = intArrayOf(2, 5, 5, 6)
    val target = 7

    try {
        println("Approach 1 Result: ${twoSum.approach1(nums, target).contentToString()}")
        println("Approach 2 Result: ${twoSum.secondApproach(nums, target).contentToString()}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
