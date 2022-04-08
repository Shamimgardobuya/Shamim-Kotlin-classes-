fun main(){
    var x=Person("Jane",34)
    var y = Person("John",34)
    var t = Person("Shamun",23)
    var girl= Person("Judy",34)
    x.getPeople()
    println(t.name == y.name)//Remember once again that a class is a blueprint of a project.
    //We could use arrays but now accessing different arrays in same question,Java uses lists for that case.Kotlin does not
//I have made a project that prints out people's name and their age in Kotlin.
   // heckInRange(date: MyDate, first: MyDate, last: MyDate gonna tackle that one.
    }

class Person(var name:String,var age:Int){
    fun getPeople():String{
        return name



    }

}



