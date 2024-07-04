package ktlin.leetcode.array

fun isPalindrome(ss: String): Boolean {
    val s = ss.lowercase()
    var start = 0
    var last = s.length -1

    while(last > start){
        if(!s[start].isLetterOrDigit()){
            start++
            continue
        }

        if(!s[last].isLetterOrDigit()) {
            last --
            continue
        }
        if(s[start]==s[last]) {
                start++
                last--
        }
        else
            return false
    }
    return true
}