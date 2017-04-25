package Exercise

class Exercise11 {
    static void main(String[] args) {
        OutputStream dst = new FileOutputStream("/home/prashant/image1.jpg")
        new File("/home/prashant/image.jpg").eachByte {
            buffer -> dst.write(buffer)
        }

        dst.close()

    }
}
