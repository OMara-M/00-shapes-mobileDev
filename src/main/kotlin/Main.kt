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

    print("Set Circle.Radius: ")
    var r:Int = scanner.nextInt()
    myCircle.setDimensions(r.toDouble())

    print("Set Triangle.sideA: ")
    var sideA:Int = scanner.nextInt()
    print("Set Triangle.sideB: ")
    var sideB:Int = scanner.nextInt()
    print("Set Triangle.sideC: ")
    var sideC:Int = scanner.nextInt()
    myTriangle.setDimensions(sideA.toDouble(), sideB.toDouble(), sideC.toDouble())

    print("Set EquilateralTriangle.side: ")
    var side:Int = scanner.nextInt()
    myEquilateralTriangle.setDimensions(side.toDouble())

    println("\n" + mySquare.name)
    mySquare.printDimensions()
    println("Area: " + mySquare.getArea())

    println("\n" + myCircle.name)
    myCircle.printDimensions()
    println("Area: " + myCircle.getArea())

    println("\n" + myTriangle.name)
    myTriangle.printDimensions()
    println("Area: " + myTriangle.getArea())

    println("\n" + myEquilateralTriangle.name)
    myEquilateralTriangle.printDimensions()
    println("Area: " + myEquilateralTriangle.getArea())
}