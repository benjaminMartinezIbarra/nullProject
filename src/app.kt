class Wolf {
    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The wolf is eating $food")
    }
}

class MyWolf {

     var wolf : Wolf? = Wolf()

fun myFunction() {
    wolf?.eat()
}

}

fun getAlphaWolf() : Wolf? {
 return Wolf()
}

fun printInt(x :Int?) {
    println("The value passed is $x")
}

fun main(args : Array<String>) {
    var w: Wolf? = Wolf()
    if (w != null){
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var mw = MyWolf()

    mw.wolf?.hunger = 8
    println("The value of mw.wolf?.hunger is ${mw?.wolf?.hunger}")
    var myArray = arrayOf("Hi", "Hello", null)
    for (item in myArray) {
        item?.let {
            println(it)
        }
    }
    getAlphaWolf()?.let {
        it.eat()
    }

    w = null
    var z = w!!.hunger
}
