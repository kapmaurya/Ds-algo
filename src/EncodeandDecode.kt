fun encode(strings: List<String>): String {
    val encoded = StringBuilder()
    for (str in strings) {
        encoded.append(str.length).append("#").append(str)
    }
    return encoded.toString()
}

fun decode(str: String): List<String> {
    val decoded = mutableListOf<String>()
    var i = 0

    while (i < str.length) {
        // Find the position of the delimiter
        val delimiterIndex = str.indexOf('#', i)
        val length = str.substring(i, delimiterIndex).toInt() // Extract the length
        val word = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length) // Extract the string
        decoded.add(word)
        i = delimiterIndex + 1 + length // Move to the next encoded part
    }
    return decoded
}

fun main() {
    val strings = listOf("neet","code","love","you") // Original list of strings

    // Encode
    val encoded = encode(strings)
    println("Encoded: $encoded")

    // Decode
    val decoded = decode(encoded)
    println("Decoded: $decoded")
}