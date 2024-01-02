package kot

private var name1: String? = null
private var name2: String? = "null"
private var name3: String? = ""

fun main() {
    val length1 = name1?.length?:0
    val length2 = name2?.length?:0
    val length3 = name3?.length?:0
    println(length1+length2+length3)
}