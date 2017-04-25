package Exercise

class Exercise10 {
    static void main(String[] args) {
        def dst = new File("/home/prashant/dummyFile3.txt")
        new File("/home/prashant/dummyFile.txt").eachLine {
            line ->
                line.each {
                    character ->
                        if (character != " ") {
                            dst << character
                        }
                }
        }
    }
}
