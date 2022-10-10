package `in`.codersclub.myapplication

fun main(){
    val myFirstDice= MainActivity()
    val diceRoll = myFirstDice.roll()
    println("your ${myFirstDice.sides} sided dice rolled ${diceRoll}")
    myFirstDice.roll()


}

class MainActivity {
    var sides = 6

    fun roll(): Int {
        val RandomNumber = (1..6).random()
        return RandomNumber

    }
}