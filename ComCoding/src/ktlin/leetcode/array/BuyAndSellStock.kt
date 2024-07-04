package ktlin.leetcode.array

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    var currentPrice = prices[0]
    for(price in prices){
        if(price > currentPrice ){
            maxProfit += price - currentPrice
        }

        currentPrice = price
    }
    return maxProfit
}