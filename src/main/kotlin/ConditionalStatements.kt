fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age < 18){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 70
    var height = 1.8
    var bmi = weight/(height * height)
    if (bmi < 18){
        println("Underweight")
    }else if (bmi <= 29){
        println("Normal weight")
    }else if (bmi <= 34){
        println("Overweight")
    }else{
        println("Obese")
    }

    var maths = 60
    var english = 60
    var physics = 40
    var result = (maths + english +physics)/3
    if (result <= 50){
        println("Below Average")
    }else if (result <= 60){
        println("Average")
    }else{
        println("Excellent")
    }
    // WHEN STATEMENTS
    var bettingNumber = 2
    when(bettingNumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 -4 to bet")
        }
    }
}