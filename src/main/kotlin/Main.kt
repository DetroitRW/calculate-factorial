import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите цисло: ")
    val n = reader.nextInt()
    var f = 1

    for (i in (1..n)) {
        f *= i
    }
    print("Факториал числа: $n = $f")

}