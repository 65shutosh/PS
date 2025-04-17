package leetcode75.string

import kotlin.math.min

fun mergeAlternately(word1: String, word2: String): String {
    val mergedString = StringBuilder()
    val len = min(word2.length,word1.length)
    var i =0
    while(i <= len-1){
        mergedString.append(word1[i]).append(word2[i])
        i++
    }
    if (word1.length == word2.length) return mergedString.toString()
    if(word1.length > word2.length) mergedString.append(word1,len,word1.length) else mergedString.append(word2,len,word2.length)
    return mergedString.toString()
}