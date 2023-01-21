import java.util.*

fun main() {
    println("Программа для подсчёта букв в строке")
    print("Введите строку: ")
    val str = readln()

    var letters: MutableList<Char> = mutableListOf(str[0])

    for (element in str){
        if (!letters.contains(element)){
            letters.add(element)
        }
    }
    letters.sort()

    for (item in letters){
        println(item + ": " + Collections.frequency(str.toList(), item))
    }
}