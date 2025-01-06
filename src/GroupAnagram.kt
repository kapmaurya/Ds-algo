
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val anagramMap = mutableMapOf<String, MutableList<String>>()

    for (str in strs) {
        val sortedStr = str.toCharArray().sorted().joinToString("")
        anagramMap.computeIfAbsent(sortedStr) { mutableListOf() }.add(str)
    }

    return anagramMap.values.toList()
}

fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val groupedAnagrams = groupAnagrams(strs)

    for (group in groupedAnagrams) {
        println(group)
    }
}