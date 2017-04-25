package Exercise

class Exercise7 {
    static void main(String[] args) {
        def list = new ArrayList()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)
        list.add(6)
        list.add(7)
        list.add(8)

        def containValue = { list1, value -> list1.contains(value) }
        println(containValue(list, 3))

    }
}
