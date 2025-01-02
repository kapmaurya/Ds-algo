import java.util.HashSet

public class Dublicate{
    fun containDublicate(nums:IntArray):Boolean{
        val hashSet = HashSet<Int>()
        for(num in nums){
            if(!hashSet.add(num)){
                return true
            }
        }
        return false
    }
    fun showResult(nums: IntArray) {
        val result = containDublicate(nums)
        println("Contains duplicate: $result")
    }


}

fun main() {
    val nums = intArrayOf(1, 2, 3, 5, 5)
    val duplicateChecker = Dublicate()
    duplicateChecker.showResult(nums)
}