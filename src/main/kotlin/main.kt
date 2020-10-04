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

    var numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    println(numbers)
    println(numbers.map{a->})
    println(numbers.map{a->a*a})

    println(numbers.map{it*it})
    println(numbers.filter{it%2==0}.map{it*it})
}

fun add(a: Double, b: Double) : Double{
    return a+b
}
