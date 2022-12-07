import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите цисло: ")
    val n = reader.nextInt()

    print("Факториал числа: ${factorial(n)}")

}
fun factorial (n: Int) : Int {
    if (n == 0) return 1;
    return factorial(n - 1) * n
}