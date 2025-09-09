fun main(args: Array<String>) {
    // The caesar chiper
    // variable initialization
    val s = "blackholesarewheregoddividebyzero"
    println("Original message: $s")
    var message = ""
    var shift = 1

    //Loop iterating over characters
    for (c in s) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }

    //Printing
    println("Encrypted message: $message")
}