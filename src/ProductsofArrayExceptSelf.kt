
fun productExceptSelf(nums: IntArray): IntArray {

    val output = IntArray(nums.size) { 1 } // Initialize output array with 1s

    // Calculate prefix product
    var a = 1
    for (i in nums.indices) {
        output[i] = a
        a *= nums[i]
    }

    // Calculate suffix product and multiply with prefix product
    var b = 1
    for (i in nums.indices.reversed()) {
        output[i] *= b
        b *= nums[i]
    }

    return output
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf(nums)
    println("Output: ${result.joinToString(", ")}")
}
