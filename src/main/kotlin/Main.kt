fun main() {
    schoolName()

  println( nameAndAge("Eunice Musenyia", 23))
    println(word("Kotlin"))
    callMe("Eunice")





}
fun schoolName(){
    var schoolName= "Akirachix"
    println(schoolName[0])
    println(schoolName[2])
    println(schoolName[3])

}


fun nameAndAge(name: String, age: Int):String{
   return   "Hi, my name is $name, I am $age years old"

}
fun word(name: String): Int{
    return name.length

}
fun callMe(name: String){
    val myName = "Eunice"
    if(name.equals(myName)) { println("That's me") }
    else {println("I don't know who that is") }
}
