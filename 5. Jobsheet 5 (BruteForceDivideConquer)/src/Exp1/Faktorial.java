package Exp1;

public class Faktorial {

    int factorialBF(int n){
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    int factorialDC(int n){
        if (n == 1) {
            return 1;
        } else {
            int facto =  n * factorialDC(n - 1);
            return facto;
        }
    }
}