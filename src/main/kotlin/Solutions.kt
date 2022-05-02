fun solution(): Int {
    val reader = FileReader()
    val input = reader.getPuzzle1()
    if (input.isEmpty()) return 0

    var count = 0
    var previous = input[0]
    val next = input.drop(1)
    for (current in next) {
        if (current > previous) {
            count += 1
        }
        previous = current
    }
    return count
}

