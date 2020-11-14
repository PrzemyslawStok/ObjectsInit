class Student(name: String = "Przemysław", surname: String = "Stokłosa"){
    var array: Array<Int>
    var weight: Double = 0.0
    var myNo: Int = 0

    lateinit var info: String
    var info1:String? = null

    constructor(weight: Double):this("Przemysław","Stokłosa"){
        this.weight = weight

        info = "zamowienia w stołówce"
    }

    init{
        array = arrayOf(1,2,3,4,5)
        println("init...")
        myNo = noStudents+1
        noStudents++
        studentsDatabase.add(this)

        //info = ""
    }

    companion object{
        var noStudents = 0
        var studentsDatabase = mutableListOf<Student>()

        fun studentsInfo(){
            println("Liczba studentów w bazie: $noStudents")
        }

        fun listStudentDatabase(){
            studentsDatabase.forEach{println(it.toString())}
        }
    }

    override fun toString(): String {
        info1?.let{
            println(info1)
        }
        return "Student(weight=$weight, myNo=$myNo)"
    }
}
