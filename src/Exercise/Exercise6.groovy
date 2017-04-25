package Exercise

class Exercise6 {
    def multipleTimes(int number) {
        println("Times Method")
        10.times { i ->
            println(++i * number)
        }
    }

    def multipleUpto(int number = 3) {
        println("Upto Method")
        1.upto(10) {
            println(it * number)
        }
    }

    def multipleEach(int number = 3) {
        println("Each Method")
        (1..10).each { i ->
            println(i * number)
            i++
        }
    }

    def multipleStep(int number = 3) {
        println("Step Method")
        1.step 11, 1, {
            println(it * number)
        }
    }


    def multipleReturn(int number = 3) {
        println("Return Method")
        List list = new ArrayList()
        10.times { i ->
            list.add(++i * number)
        }
        list
    }

    static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        exercise6.multipleTimes(3)
        exercise6.multipleUpto()
        exercise6.multipleEach()
        exercise6.multipleStep()
        List list = exercise6.multipleReturn(3)
        println(list.toString())
    }
}
