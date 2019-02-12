class BadException : Exception()

    fun myFunction(test : String) {
        print("t")
        print("h")
        print("r")
            try {
                riskyCode(test)
            } catch (e: BadException) {
                print("a")
            }
        finally {
            print("w")
            print("s")
        }

    }


fun riskyCode(test : String) {
    if (test == "yes") {
        throw BadException()
    }
    print("o")
}
fun main(args : Array<String>) {
    myFunction("yes")
    myFunction("yesdd")
}

