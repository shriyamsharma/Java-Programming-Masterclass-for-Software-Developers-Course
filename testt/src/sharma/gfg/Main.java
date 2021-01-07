package sharma.gfg;

public class Main {

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.print(reverseWords(s));
    }

    private static String reverseWords(String s) {
        int start =0;
        int end = s.length()-1;
        String res = "";
        for(start =0; start<s.length(); start++) {
            if(s.charAt(start) != ' ') {
                break;
            }
        }
        for(end = s.length()-1; end>=0; end--) {
            if(s.charAt(end) != ' ') {
                break;
            }
        }

        for(int e = end; e>= 0; e--) {
            if(s.charAt(e) == ' ') {
                res += " ";
                while(s.charAt(e) == ' ') {
                    end = e;
                    e--;
                }
            }
            res += Character.toString(s.charAt(end));
        }
        String temp = "";
        for(int st= 0; st<res.length(); st++) {
            if(res.charAt(st) == ' ') {
                temp += " ";
            } else {
                int cur = st;
                while(res.charAt(cur) != ' ') {
                    cur++;
                }
                while(cur>=st) {
                    temp += Character.toString(res.charAt(cur));
                    st++;
                }
            }
        }
        return temp;
    }
}
