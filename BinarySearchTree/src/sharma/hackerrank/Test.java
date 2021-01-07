package sharma.hackerrank;

public class Test{

    public static void checkIsEmpty(Tree t) throws Exception{

        if (t instanceof EmptyBST){
            if (!t.isEmpty()){
                throw new Exception("All is Good");
            }
        } else if (t instanceof NonEmptyBST){
            if (t.isEmpty()){
                System.out.println("Tree is non Empty bST");
            }
        }

    }

}
