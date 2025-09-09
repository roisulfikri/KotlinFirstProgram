fun main(args: Array<String>) {
    // Split() and joinToString()
    // Morse code decoder
    // The string which we want to decade
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    // The string with the decode message
    var message = ""

    // array definitions
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
        "--..")

    // splitting the string into Morse characters
    val characters = s.split(" ")

    //iterating over Morse characters
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        //character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}