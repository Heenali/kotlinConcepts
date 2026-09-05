//HEENALI lakhani
//{H=2, E=2, N=2, A=3, L=2, I=2, K=1}
fun duplicatecounter(mystring:String)
{
    val removeduplicate= mutableMapOf<Char,Int>()


    for(i in mystring.indices)
    {

        if(removeduplicate.containsKey(mystring.get(i)))
        {
            var s=removeduplicate.get(mystring.get(i))
            if (s != null) {
                removeduplicate.put(mystring.get(i),(s+1))
            }
        }
        else
           removeduplicate.put(mystring.get(i),1)


    }
    println( removeduplicate.toString())

}

fun dup(myString:String)
{
    var map= hashMapOf<Char,Int>()
    for(i in myString)
    {
        if(map.containsKey(i))
        {
            map[i]=map[i]!!+1
        }
        else
            map[i]=1
    }
}
fun main()
{
    var s= "HEENALI lakhani"
    s=s.replace(" ","")
    s=s.toUpperCase()
    duplicatecounter(s)
}
