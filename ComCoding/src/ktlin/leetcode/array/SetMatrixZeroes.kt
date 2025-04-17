package ktlin.leetcode.array

fun setZeroes(matrix: Array<IntArray>): Unit {
    val size = matrix.size
    for (i in 0 until size){
        for (j in 0 until matrix[0].size){
            if(matrix[i][j] == 0){
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }
    for (j in 1 until matrix[0].size){
        if (matrix[0][j] == 0){
            for (i in matrix.indices){
                matrix[i][j] = 0
            }
        }
    }

    for (i in 1 until matrix.size){
        if (matrix[i][0] == 0){
            for (j in matrix[0].indices){
               matrix[i][j] = 0
            }
        }
    }
    if(matrix[0][0] == 0){
        for (j in matrix[0].indices){
            matrix[0][j] = 0
        }
        for (i in matrix.indices){
            matrix[i][0] = 0
        }
    }
}