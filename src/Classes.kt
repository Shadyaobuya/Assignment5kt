
fun main(){
    //Question1
    var person=Human("Shadya", 22, 68.5f)
    person.eat(5)
    person.speak("Hello World I hope you're fine")
    person.birthday()


    //Question2
    var userDetails=User("Shadya", "Obuya", "shadyaobuya@gmail.com", "07234567", "shadya")
    println(userDetails.firstName)
    println(userDetails.email)






}
//Question1
class Human(var name:String, var age:Int, var weight:Float){
    fun eat(foodWeight: Int){

        println("I am eating $foodWeight kgs of food ")
        var newWeight=foodWeight+weight
        println(newWeight)

    }

    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        var newAge=age+1
        println(newAge)
    }

}
//Question2

data class User(var firstName:String,var lastname:String, var email:String, var phoneNumber:String ,var password:String)