fun printMiddle(xRange: IntRange, yRange: IntRange) {
    object MidPoint { // Named object 'MidPoint' is a singleton and cannot be local. Try to use anonymous object instead
        val x = (xRange.first + xRange.last) / 2
        val y = (yRange.first + yRange.last) / 2
    }
    println("${MidPoint.x}, ${MidPoint.y}")
}
