fun main() {
    oddNumbers()
    arrayOfNames("Babra","Chelangat")
    robotServe(20)
    number(25)

}
fun oddNumbers(){
    for (x: Int in 1..100 step 2){
        println(x)
    }
}
fun arrayOfNames(name:String,name2:String){
    if (name.length > 5 ) {
        println("Babra")
    }else
        println("Chelangat")

}
fun robotServe(age: Int){
    when(age){
      in   1..5 -> println("Serve guests a glass of milk")
       in  6..14 -> println("Serve guests a bottle of fanta orange")
        else -> println("Serve a bottle of coca cola")
    }
}
fun number(num:Int){
    for (n in 1..100){
        if(n%3==0){
            println("fizz")
        }
        else if(n%5==0){
            println("Buzz")

        }
        else if(n%3==0 && n%5==0) {
            println("fizzBuzz")
        }
        else{println(n)}
    }

}