package Exercise

class Exercise9 {
    static void main(String[] args) {
        def linenumber = 1;
        def dst = new File("/home/prashant/dummyFile2.txt")
        new File("/home/prashant/dummyFile1.txt").eachLine {
            line ->
                println(line)
                if (linenumber % 2 != 0) {
                    dst << linenumber + line + "\n"
                }
                else
                    dst << line + "\n"
                linenumber++
        }
    }

}
