fun sum(numbers: IntArray): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("empty")
    
    for (i in 1..numbers.lastIndex) result += numbers[i]
    
    return result
}
