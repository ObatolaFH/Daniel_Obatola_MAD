
fun main(){
    val numberToGuess = randomNumber()

    appLoop(numberToGuess)
}

fun appLoop(number:Int){
    val digits = number.toString().toCharArray()
    var guessed: CharArray

    var m: Int = 0
    var n: Int = 0

    println("A random four digit number was generated with no repeating digits. Guess the number:")

    while(true){

        val stringInput = readLine()!!
        guessed = stringInput.toString().toCharArray()
        for (i in 0..3){
            for (j in 0..3){
                if(guessed[i] == digits[j]){
                    n++
                }
            }
            if(guessed[i] == digits[i]){
                m++
            }
        }
        println("$n $m")
        if(m == 4){
            println("Correct!")
            break
        }
        println("Try again!")
        n = 0
        m = 0

    }
}

fun randomNumber(): Int {
    val numbers: MutableList<Int> = ArrayList()
    for (i in 0..9) {
        numbers.add(i)
    }

    numbers.shuffle()

    var result = ""
    for (i in 0..3) {
        result += numbers[i].toString()
    }
    return result.toInt();
}