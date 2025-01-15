import java.util.*

fun topKFrequent(nums: IntArray, k: Int): List<Int> {
    val frequencyMap = mutableMapOf<Int, Int>()


    for (num in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    val maxHeap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
    for ((num, freq) in frequencyMap) {
        maxHeap.offer(Pair(num, freq))
    }

    val result = mutableListOf<Int>()
    repeat(k) {
        result.add(maxHeap.poll().first)
    }

    return result
}

fun main() {
    val nums = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2
    val result = topKFrequent(nums, k)

    println(result)
}
