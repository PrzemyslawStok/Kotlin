fun main(){
    var name = "Przemysław"
    val surname = "Stokłosa"

    var a = 2.0
    var b = 5.0

    println("Imię: "+name+" Nazwisko: "+surname)
    println("Imię: ${name} Nazwisko: ${surname}")

    //2.0+5.0=7.0
    val add = a+b

    println(""+a+" + "+b+" = "+add)
    println("${a} + ${b} = ${add(a,b)}")
    println("${a} - ${b} = ${a-b}")
    println("${a} * ${b} = ${a*b}")
    println("${a} / ${b} = ${a/b}")

    var student = Student("Przemysław","Stokłosa",72.0)
    student.printStudent()
}

fun add(a: Double, b: Double) : Double{
    return a+b
}
