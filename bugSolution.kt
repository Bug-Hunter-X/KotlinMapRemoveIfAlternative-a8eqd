fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")

    // Correct way to remove elements from a map based on a condition:
    val keysToRemove = mutableListOf<Int>()
    for ((key, value) in map) {
        if (key % 2 == 0) {
            keysToRemove.add(key)
        }
    }

    keysToRemove.forEach { map.remove(it) }

    println(map) // Output: {1=one, 3=three, 5=five}
} 