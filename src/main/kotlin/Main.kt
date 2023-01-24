import java.util.*

fun main() {
    println("Программа для подсчёта букв в строке")
    print("Введите строку: ")
    val userInput = readln()
    val letters = userInput.toSortedSet()
    for (letter in letters){
        println(letter + ": " + Collections.frequency(userInput.toList(), letter))
    }
}