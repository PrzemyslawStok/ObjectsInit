class Student(name: String = "Przemysław", surname: String = "Stokłosa"){
    var array: Array<Int>
    var weight: Double = 0.0

    constructor(weight: Double):this("Przemysław","Stokłosa"){
        this.weight = weight
    }

    init{
        array = arrayOf(1,2,3,4,5)
        println("init...")
    }
}
