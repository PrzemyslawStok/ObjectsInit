class Student(name: String, surname: String){
    var array: Array<Int>
    var weight: Double = 0.0

    constructor(weight: Double){
        this.weight = weight
    }

    init{
        array = arrayOf(1,2,3,4,5)
        println("init...")
    }
}
