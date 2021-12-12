package pl.uwm.rybinski.Lab02;


public class Tests {
    public static void functionTests(){
        int n = 6;
        int[] arr = {0, -1, 2, 5, 4, 5};

        // a
        {
            int result = 0;
            for (int i : arr) {
                if (i % 2 == 0)
                    result++;
            }
            if (result != 3) throw new AssertionError(  "Even/Odds test is invalid");
            if(result != Lab02.ileParzystych(arr)) throw new AssertionError("ileParzystych() return invalid value");
            if((n-result) != Lab02.ileNieparzystych(arr)) throw new AssertionError("ileNieparzystych() return invalid value");
        }
        //b
        {
            int zero = 0;
            int negative = 0;
            int positive = 0;
            for (int i : arr) {
                if (i == 0)
                    zero++;
                else if (i > 0)
                    positive++;
                else
                    negative++;
            }
            if(zero != 1) throw new AssertionError("Zeroes count test is invalid");
            if(zero != Lab02.ileZerowych(arr)) throw new  AssertionError("ileZerowych() return invalid value");
            if(negative != 1) throw new  AssertionError("Negative count test is invalid");
            if(negative != Lab02.ileUjemnych(arr)) throw new AssertionError( "ileUjemnych() return invalid value");
            if(positive != 4) throw new AssertionError(  "Positive count test is invalid");
            if(positive != Lab02.ileDodatnich(arr)) throw new AssertionError(  "ileDodatnich() return invalid value");
        }
        //c
        {
            int max = Integer.MIN_VALUE;
            int max_count = 1;
            for (int i : arr) {
                if (i >= max) {
                    if (i == max)
                        max_count++;
                    else {
                        max = i;
                        max_count = 1;
                    }
                }
            }
            if(max_count != 2) throw new AssertionError("Max count test is invalid");
            if(max_count != Lab02.ileMaksymalnych(arr)) throw new AssertionError("ileMaksymalnych() return invalid value");

        }
        //d
        {
            int negative = 0;
            int positive = 0;
            for (int i : arr) {

                if (i > 0)
                    positive += i;
                if (i < 0)
                    negative += i;
            }

            if(negative != -1) throw new AssertionError("Negative sum test is invalid");
            if(negative != Lab02.sumaUjemnych(arr)) throw new AssertionError("sumaUjemnych() return invalid value");
            if(positive != 16) throw new AssertionError("Positive sum test is invalid");
            if(positive != Lab02.sumaDodatnich(arr)) throw new AssertionError("sumaDodatnich() return invalid value");
        }

        //e
        {
            int result = 0;
            int tmp = 0;
            for (int i : arr) {
                if (i > 0)
                    tmp++;
                if (tmp > result)
                    result = tmp;
                if (i < 1)
                    tmp = 0;
            }
            if(result != 4) throw new AssertionError("Max positive combo test is invalid");
            if(result != Lab02.dlugoscMaksymalnegoCiaguDodatnich(arr)) throw new AssertionError("dlugoscMaksymalnegoCiaguDodatniego() return invalid value");
        }

        //g
        int lewy = 1;
        int prawy = 3;

        for(int i = 0; i < (prawy-lewy+1)/2; i++)
        {
            int val = arr[lewy+i];
            arr[lewy+i] = arr[prawy-i];
            arr[prawy - i] = val;
        }
        //int[] arr = {0, -1, 2, 5, 4, 5};
        {
            int[] test1 = {0, 5, 2, -1, 4, 5};
            for(int i = 0; i < arr.length; i ++)
                if(arr[i] != test1[i]) throw new AssertionError("reverse part test is invalid");

            int[] test2 = {5, 4, -1, 2, 5, 0};
            Lab02.odwrocFragment(arr, 0, 5);
            for(int i = 0; i < n; i++)
                if(arr[i] != test2[i]) throw new AssertionError("odwrocFragment() is invalid");
        }

        //f

        {

            int[] tmp = new int[arr.length];
            System.arraycopy(arr, 0, tmp, 0, arr.length);

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0)
                    arr[i] = 1;
                if (arr[i] < 0)
                    arr[i] = -1;
            }
            int[] test = {1, 1, -1, 1, 1, 0};
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] != test[i]) throw new AssertionError("signum test is invalid");
            }

            Lab02.signum(tmp);

            for(int i = 0; i < arr.length; i++) {
                if (tmp[i] != test[i]) throw new AssertionError("signum() is invalid");
            }

        }
    }

    public static void matrixTests(){
        {
            int[][] gentest = Lab02.generateIntMatrix(12, 12, -10, 10);
            for(int[] ints: gentest){
                for (int i:
                        ints) {
                    if(i > 10 || i <-10)
                        throw new AssertionError("generateIntMatrix() return matrix with invalid values");
                }
            }
            if(gentest.length != 12 || gentest[0].length != 12)
                throw new AssertionError("generateIntMatrix() return matrix of invalid size");
        }
        int[][] a = {{1,0,2},
                {-1,3,1}};
        int[][] b = {{3, 1},
                {2, 1},
                {1, 0}};
        {
            //transpose test
            int[][] test1 = {{3, 2, 1}, {1, 1, 0}};
            int[][] transposed_b = Lab02.transposeMatrix(b);
            for(int i = 0; i < transposed_b.length; i++){
                for(int j = 0; j < transposed_b[0].length; j++){
                    if(transposed_b[i][j] != test1[i][j])
                        throw new AssertionError("transposeMatrix() return invalid matrix");
                }
            }
        }
        {
            //dot product test
            int[] v1 = {1, 0, 2};
            int[] v2 = {3, 2, 1};
            if (Lab02.dotProduct(v1, v2) != 5)
                throw new AssertionError("dotProduct() return invalid value");
        }

        {
            //multiply matrix test
            int[][] test = {{5, 1}, {4, 2}};
            int[][] c = Lab02.multiplyMatrices(a, b);
            for(int i = 0; i < c.length; i++){
                for(int j = 0; j < c[0].length; j++){
                    if(c[i][j] != test[i][j])
                        throw new AssertionError("multiplyMatrices() return invalid matrix");
                }
            }
        }

    }
    public static void test(){
        functionTests();
        matrixTests();
    }
}
