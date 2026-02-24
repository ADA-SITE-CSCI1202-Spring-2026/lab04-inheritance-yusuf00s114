public class MathDemo {

    static int min(int a, int b){
        return a < b ? a : b;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }

    static int sum(int args[]){
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }

    /*
    Answer for f:
        The advantage of defining these methods as static would be that
        you wouldn't need to instantiate the class in order to call the methods.
        This would be useful, for example, when creating helper methods, such as
        ones in the Mathf class.
     */

    public static void main(String[] args) {

    }
}
