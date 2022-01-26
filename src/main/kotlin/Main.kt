import java.util.Scanner

fun main(args: Array<String>){
    val mySquare = Square("Square")
    val myCircle = Circle("Circle")
    val myTriangle = Triangle("Triangle")
    val myEquilateralTriangle = EquilateralTriangle("EquilateralTriangle")

    val scanner = Scanner(System.`in`)

    print("Set Square.Length: ")
    var l:Int = scanner.nextInt()
    print("Set Square.Height: ")
    var h = scanner.nextInt()
    mySquare.setDimensions(l.toDouble(), h.toDouble())
    println(mySquare.name)
    mySquare.printDimensions()
    println(mySquare.getArea())
}