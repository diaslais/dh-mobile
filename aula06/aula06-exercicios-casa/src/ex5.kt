fun comparaNumeros(numA: Int, numB: Int, numC: Int, numD: Int) = ((numA > numC && numA > numD) || (numB > numC && numB > numD))

fun main() {
    println("Digite 4 números: ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    var d = readLine()!!.toInt()

    println(comparaNumeros(a, b, c, d))
}