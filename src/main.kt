fun main(){

    var y=getMode(7,4)
    println(y)

    var z=getAnswer("rehema",22)
    println(z)
    var x=getSolution("vitz")
    println{x}

}
fun getMode(a:Int,b:Int):Int{
   var mode=a%b
    return mode


}
fun getAnswer(name:String,age:Int):String{
    var answer="Hi my name is rehema"+ " " + "and am 22 years old"

    return answer

}
fun getSolution(name:String):String{
    var car="vitz"
    println(name.length)
    return car
}

