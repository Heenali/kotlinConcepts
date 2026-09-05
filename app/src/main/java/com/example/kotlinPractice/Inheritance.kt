fun main()
{

    var baseClass=Student1()
    baseClass.getName()

    var subClass=Marks()
    subClass.getName()
    subClass.getSub()
}
open class Student1
{
  open  var name:String="Heenali"

   open fun getName()
    {
        println("Student : ${name}")
    }

}
class Marks : Student1()
{
    var sub1:Int=100
    override var name="Lakhani"
    override fun getName()
    {
        super<Student1>.getName()//display base class fun
        println("Marks Class: ${name}")
    }
    fun getSub()
    {
        println("Marks Class: ${sub1}")
    }

}