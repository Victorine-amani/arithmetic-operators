fun main(){
    introduction("Victorine Amani",20)
    dispenser(5)
    println(long(arrayOf("Victorine","Favour","Joel","Hezborn")))
    mul(20,10)
    divs(20,10)
    mode(20,10)
    var human=Human("Victorine",20,70.6)
    human.eat(2)
    human.speak("I am a string data type in Kotlin")
    human.birthday()
    comparison(2,4)
}

fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old.")

}
/*2.You are required to program a machine that dispenses juice to students . The school management needs  a program
that serves a glass of milk to students under the age of 6 years, serves a bottle of fanta
to students more than 6 years but not older than 15 years. The remaining lot serves cocacola.*/

fun dispenser(age:Int){
    if (age>1 && age<=6) {
        println("Milk")
    }else if(age>6 && age <=15) {
        println("Fanta")
    }else{println("cocacola")
    }
}
/*3.Given an array of names, create a function that will return number of names longer than 4 characters*/

fun long(names:Array<String>):Int{
    var num= emptyArray<String>()
    for (name in names)
        if (name.length<4)
            num.plusElement(name)
    return num.size

}
/*.Create functions to multiply, divide and find the modulus of 2 numbers. Invoke each of these functions
inside the main function*/
fun mul(a:Int,b:Int){
    println(b*a)
}

fun divs(a:Int,b:Int){
    println(a/b)
}
fun mode(a:Int,b:Int){
    println(b%a)
}

/*5. Create a class called Human with these attributes: name, age, weight. It has the following functions:
- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food” and increments the human’s
weight by the weight of the food eaten - speak(speech: String) :Prints the string passed to it
- birthday( ) :Increments the human’s age by 1
Create an instance of this human class and invoke all its functions*/

class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodweight:Int){
        var newWeight=foodweight+weight
        println(newWeight)
        println("I am eating $foodweight kgs of food")
    }

    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(age+1)
    }
}
/*6..Create a function  called comparison. The function takes two numbers as parameters and the function
should return the lesser of the true*/

fun comparison(x:Int,y:Int):Int {
    var b = x > y
    var c = y > x
    if (b == true) {
        println(y)
    } else if (c == true) {
        println(x)
    }
    return y
}