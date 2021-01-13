public class Calculator {
    int add (int ... values){
       int sum = 0;
       for (int v : values){
           sum+=v;
       }
       return sum;
    }

    int sub (int ... values){
        int sub = values[0];
        for(int i = 1; i < values.length; i++){
            sub-=values[i];
        }
        return sub;
    }
    double div (int ... values){
        double div = (double)values[0];
        for(int i = 1; i < values.length; i++){
            div/=values[i];
        }

        return div;
    }
    int multi (int ... values){
        int multi = 1;
        for(int v :values){
            multi*=v;
        }
        return multi;
    }
}
