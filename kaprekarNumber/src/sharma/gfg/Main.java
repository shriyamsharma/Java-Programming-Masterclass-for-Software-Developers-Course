package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        kaprekarNumbers(1,1000000);
    }

    static void kaprekarNumbers(int p, int q) {

        boolean isInvalid = false;
        for(int i = p; i<=q; i++){
            int num = i;
            long sq = (long) num * num;
            String str = String.valueOf(sq);
            String lStr = str.substring(0,str.length()/2);
            String rStr = str.substring(str.length()/2);

            int lNum = (lStr.isEmpty()) ? 0 : Integer.parseInt(lStr);
            int rNum = (rStr.isEmpty()) ? 0 : Integer.parseInt(rStr);

            if (num == (lNum+rNum)){
                isInvalid = true;
                System.out.print(i + " ");
            }
        }

        if (!isInvalid){
            System.out.println("INVALID RANGE");
        }
    }
}
