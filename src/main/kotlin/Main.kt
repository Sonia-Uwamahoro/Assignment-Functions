

fun main(args: Array<String>) {

    greeting("Ada")

    var result = division(23.2, 5.5)
    println(result)

    var total = addition(22, 32, 45, 11)
    println(total)

    interestingFact()

}

//Function That prints hello name
fun greeting(name: String){
    println("Hello" + " " + name)

}


//Function That returns a remainder
fun division(num1: Double, num2: Double): Double{
    var remainder = num1 % num2
    return  remainder

}

//Function that returns the sum
fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum

}

//Function that prints an interest fact
fun interestingFact(){
    var funFact = "I love singing in the shower"
    println(funFact)
}