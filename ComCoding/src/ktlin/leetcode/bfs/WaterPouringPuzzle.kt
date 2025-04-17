package ktlin.leetcode.bfs

fun measureWater(jug1: Int, jug2: Int, target: Int): Int {
    if(jug1+jug2<target) return -1
    val visited = mutableSetOf<Pair<Int, Int>>()
    val queue = ArrayDeque<Triple<Int, Int, List<String>>>()
    queue.add(Triple(0, 0, emptyList()))

    while (queue.isNotEmpty()) {
        val (x, y, path) = queue.removeFirst()

        if (x == target || y == target || x + y == target) {
            println("Steps to reach the target:")
            path.forEachIndexed { index, step ->
                println("${index + 1}. $step")
            }
            println("Final state: Jug1: $x liters, Jug2: $y liters")
            return 0
        }

        if (Pair(x, y) in visited) continue
        visited.add(Pair(x, y))

        // Fill jug1
        if (x < jug1) queue.add(Triple(jug1, y, path + "Fill jug1"))
        // Fill jug2
        if (y < jug2) queue.add(Triple(x, jug2, path + "Fill jug2"))
        // Empty jug1
        if (x > 0) queue.add(Triple(0, y, path + "Empty jug1"))
        // Empty jug2
        if (y > 0) queue.add(Triple(x, 0, path + "Empty jug2"))
        // Pour jug1 to jug2
        if (x > 0 && y < jug2) {
            val amount = minOf(x, jug2 - y)
            queue.add(Triple(x - amount, y + amount, path + "Pour jug1 to jug2"))
        }
        // Pour jug2 to jug1
        if (y > 0 && x < jug1) {
            val amount = minOf(y, jug1 - x)
            queue.add(Triple(x + amount, y - amount, path + "Pour jug2 to jug1"))
        }
    }

    println("It's not possible to measure $target liters with jug1 ($jug1 liters) and jug2 ($jug2 liters).")
    return -1
}