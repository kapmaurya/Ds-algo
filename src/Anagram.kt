import java.util.Arrays

fun main() {
val isAnagram = isAnagrams("ABCD" , "DCsA")
    if(isAnagram){
        println("Anagram ")
    }
        else{
            println("Not Anagram")

        }
}

fun isAnagrams(str1:String, str2:String) : Boolean{
    if(str1.length !=str2.length)
        return false
    var strArray1 = str1.toCharArray()
    var strArray2 = str2.toCharArray()

    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    val outputstr1 = String(strArray1)
    val outputstr2 = String(strArray2)

    return outputstr1 ==outputstr2

}