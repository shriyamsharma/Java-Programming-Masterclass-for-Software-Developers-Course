public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int MB = Math.round(kiloBytes / 1024);
            int KB = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + MB  +  " MB and " + KB + " KB");
        }
    }
}

//2500 KB = 2 MB and 452 KB