fun main() {

    var p=Student()
    p.personName("Heenali")
    p.personAge(30)

    var result=10.checkGreaterValue(20)
    println("Greater Value is ${result}")


}
fun Int.checkGreaterValue(secondVlaue:Int):Int
{
    if(this>secondVlaue)
        return this
    else
        return secondVlaue
}
fun Student.personName(name:String)
{
    println("Name of Person: ${name}")
}

class Student{

    fun personAge( age:Int)
    {
        println("Age of Person ${age}")
    }
}