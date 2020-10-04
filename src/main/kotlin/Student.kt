class Student(var name: String, var surname: String) {

    var weight = 75.0

    constructor(name: String, surname: String, weight: Double){

    }

    fun printStudent(){
        println("Name: ${name}")
        println("Surname: ${surname}")
        println("Weight: ${weight}")
    }
}
