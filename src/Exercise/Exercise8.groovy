package Exercise

class Exercise8 {
    static void main(String[] args) {
        def dst = new File("/home/prashant/dummyFile.txt")
        new File("/home/prashant/Testing").eachFile() {
            file -> dst << file.text
        }
    }
}
