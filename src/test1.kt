fun main(){
//    var str1 : String = "Hello"
//    var str2 = "world"
//    var str3 = "Hello"
//    print("str1===str2: ${str1===str2}") //=== 는 참조비교
//    print("str1===str2: ${str1===str3}") //=== 는 참조비교
//
    var str: String?
    str = null
    val len1 = if (str !=null) str.length else -1
    val len2 = str?.length ?: -1


}