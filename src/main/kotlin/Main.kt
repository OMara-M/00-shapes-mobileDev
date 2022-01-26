import java.util.Scanner

fun main(args: Array<String>){
    val mySquare = Square("Square")
    val myCircle = Circle("Circle")
    val myTriangle = Triangle("Triangle")
    val myEquilateralTriangle = EquilateralTriangle("EquilateralTriangle")

    val scanner = Scanner(System.`in`)

    print("Set Square.Length: ")
    val l:Int = scanner.nextInt()
    print("Set Square.Height: ")
    val h = scanner.nextInt()
    mySquare.setDimensions(l.toDouble(), h.toDouble())

    print("Set Circle.Radius: ")
    val r:Int = scanner.nextInt()
    myCircle.setDimensions(r.toDouble())

    print("Set Triangle.sideA: ")
    val sideA:Int = scanner.nextInt()
    print("Set Triangle.sideB: ")
    val sideB:Int = scanner.nextInt()
    print("Set Triangle.sideC: ")
    val sideC:Int = scanner.nextInt()
    myTriangle.setDimensions(sideA.toDouble(), sideB.toDouble(), sideC.toDouble())

    print("Set EquilateralTriangle.side: ")
    val side:Int = scanner.nextInt()
    myEquilateralTriangle.setDimensions(side.toDouble())

    println("\n" + mySquare.name)
    mySquare.printDimensions()
    println(String.format("Area: %.1f", mySquare.getArea()))

    println("\n" + myCircle.name)
    myCircle.printDimensions()
    println(String.format("Area: %.1f", myCircle.getArea()))

    println("\n" + myTriangle.name)
    myTriangle.printDimensions()
    println(String.format("Area: %.1f", myTriangle.getArea()))

    println("\n" + myEquilateralTriangle.name)
    myEquilateralTriangle.printDimensions()
    println(String.format("Area: %.1f", myEquilateralTriangle.getArea()))
}