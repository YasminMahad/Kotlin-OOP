fun main() {
    var people = Human("Yasmin", 20, 44)
    people.eat(23)
    println(people.weight)
    people.speak("English")
    people.birthday()

    var allFields = User("Sara","Mwangi","yasmin23@gmail.com",72345655,234011)
    println(allFields.Email)
    println(allFields.phoneNumber)

}

class Human (var name:String, var age:Int, var weight:Int){
    fun eat (foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }

    fun speak (speech:String){
        println(speech)
    }

    fun birthday(){
        ++age
    }
}

class User(var firstName:String, var lastName:String, var Email:String, var phoneNumber:Int, var password:Int){

}