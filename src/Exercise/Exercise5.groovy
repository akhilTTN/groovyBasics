package Exercise

class Exercise5 {
    def check(def name) {
        if(name)
            true
        else
            false
    }
    static void main(String[] args) {
        List empltyList = new ArrayList();
        List listNullValue = new ArrayList()
        listNullValue.add(null)
        listNullValue.add(null)
        listNullValue.add(null)
        listNullValue.add(null)

        if ('test') {
            println "test evaluated to true inside if 'test'"
        }
        if ("Test") {
            println "test evaluated to true inside if \"Test\""
        }
        if ('null') {
            println "test evaluated to true inside if 'null'"
        }
        if (null) {
            println "test evaluated to true inside if null"
        }
        if (100) {
            println "test evaluated to true inside if 100"
        }
        if (0) {
            println "test evaluated to true inside if 0"
        }
        if (empltyList) {
            println "test evaluated to true inside if empltyList"
        }
        if (listNullValue) {
            println "test evaluated to true inside if listNullValue"
        }
    }
}
