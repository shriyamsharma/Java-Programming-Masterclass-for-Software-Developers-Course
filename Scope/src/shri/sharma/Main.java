package shri.sharma;

public class Main {

    public static void main(String[] args) {
	    String varFour = "this is private to Main()";

	    ScopeCheck scopeCheck = new ScopeCheck();
	    scopeCheck.useInner();

	    ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);




//        System.out.println(scopeCheck.getVarOne());
//        System.out.println(scopeCheck);
//        System.out.println(scopeCheck.getPrivateVar());
//        System.out.println(varFour);
//        scopeCheck.timestwo();
//        System.out.println("**************************************");
//
//        ScopeCheck.InnerClass innerClassScopeCheck = scopeCheck.new InnerClass();
//        innerClassScopeCheck.timestwo();

    }
}
