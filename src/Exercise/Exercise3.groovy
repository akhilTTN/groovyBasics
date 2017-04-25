package Exercise

class Exercise3 {
    static void main(String[] args) {
        def pattern = '*'
        def totalNumber = 4
        def i = 1
        totalNumber.times {
            println(pattern * i)
            i = i++ * 2
        }
    }
}
