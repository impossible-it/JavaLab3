public class main {

    public static void main(String[] args) {
        /********************************************************TASK ONE*******************************************/
        int[] yep = new int[1000];                            // Создаем массив YEP с 1000 ячейками //
        for (int a=0;a<1000;a++) {                             // Вводим каждую ячейку значение от 0 до 1000 //
            yep[a]=a+1;
        }
        for (int x=0;x<yep.length;x++) {                   // Счётчик на каждую ячейку массива //
            int max = yep[x];                               // Вводим переменную макс и присваиваем каждой ячейке массива //
            int maximum = x;                                  // Вводим переменную максимум и присваиваем индексы массива //
            for (int y=x+1;y<yep.length;y++) {                        // Счёт на следущую ячейку //
                if (yep[y]>max) {                          // Если следущая ячейка масива которую мы выбрали больше чем следущая то...//
                    max = yep[y];                              // То мы меняем эти значения //
                    maximum = y;                                    // Так-же индексы //
                }
            }
            int z = yep[x];
            yep[x] = max;                         // Отсортированые уже значение проверяем и меняем местами //
            yep[maximum] = z;
        }
        for(int a= 0;a<yep.length;a++) {
            System.out.println(yep[a]);
        }
        /********************************************************TASK TWO*******************************************/
        char[] name_one = new char[]{'A','L','L','A'};
        char[] name_two = new char[]{'N','E','Z','Z','E','N'};
        char[] name_three = new char[]{'R','A','N','A','Z'};                        // Масивы со словами //
        int k = name_two.length;
        int o = name_one.length;                                                // Переменная кол-во букв //
        int p = name_three.length;
        boolean true_one = true;
        boolean true_two = true;
        boolean true_three = true;
        int i = 0;
        int q = 0;                                                    // 0-евая переменная которая будет проверят первый елемент //
        int kk = 0;
        while (i < name_two.length && true_two == true) {                  // проверям все буквы и если наше условие выполняется то продолжаем //
            k--;
            if (name_two[i] == name_two[k]) {                              // наше условие первая последняя--- вторая предпоследння и т.д //
                true_two = true;
                i++;
            } else {                                           // не подходит в условие то прекращаем цикл и присваиваем false //
                true_two = false;
            }
        }
        while (q< name_one.length && true_one == true) {
            o--;
            if (name_one[q] == name_one[o]) {
                true_one = true;
                q++;
            } else {
                true_one = false;                                   // для второго слова //
            }
        }
        while (kk< name_three.length && true_three == true) {
            p--;
            if (name_three[kk] == name_three[p]) {
                true_three = true;
                kk++;                                                // для третьего слова //
            } else {
                true_three = false;
            }
        }
        System.out.println("Проверка первого слова на ПОЛИДРОМ: " + true_one);
        System.out.println("Проверка второго слова на ПОЛИДРОМ: " + true_two);
        System.out.println("Проверка третьего слова на ПОЛИДРОМ: " + true_three);                // вывод на экран //
        /****************************************************************************************TASK 3*********************/
        int a11=2; int a12=3; int a13=0; int a14=5;
        int a21=4; int a22=-3; int a23=-1; int a24=1;                               // Вводил в переменных чтоб можно было подключить сканнер по желанию //
        int a31=2; int a32=5; int a33=1; int a34=3;                                 //  Вводим значение матрицы в переменных и присваиваем значение //
        int a41=2; int a42=7; int a43=2; int a44=-2;
        int[][] matrix = new int [4][4];
        matrix[0][0] = a11; matrix[0][1] = a12; matrix[0][2] = a13; matrix[0][3] = a14;
        matrix[1][0] = a21; matrix[1][1] = a22; matrix[1][2] = a23; matrix[1][3] = a24;               // Задаем массиву значение матриц //
        matrix[2][0] = a31; matrix[2][1] = a32; matrix[2][2] = a33; matrix[2][3] = a34;
        matrix[3][0] = a41; matrix[3][1] = a42; matrix[3][2] = a43; matrix[3][3] = a44;
        double firs_det = a11*Math.pow(-1,2)*((a22*a33*a44)+(a23*a34*a42)+(a24*a32*a43)-(a24*a33*a42)-(a22*a34*a43)-(a44*a32*a23));  // Вычеркиваем первый столбец и строку после считаем матрицу 3х3 //
        double second_det = a12*Math.pow(-1,3)*((a21*a33*a44)+(a23*a34*a41)+(a24*a31*a43)-(a24*a33*a41)-(a21*a43*a34)-(a44*a31*a23)); // Вычеркиваем второй столбец и первую строку после  считаем матрицу 3х3 //
        double third_det = a13*Math.pow(-1,4)*((a21*a32*a44)+(a22*a34*a41)+(a31*a42*a24)-(a24*a32*a41)-(a21*a42*a34)-(a31*a22*a44));   // И т.д
        double four_det = a14*Math.pow(-1,5)*((a21*a32*a43)+(a22*a33*a41)+(a31*a42*a23)-(a23*a32*a41)-(a21*a42*a33)-(a43*a31*a22));
        double determinant = firs_det+second_det+third_det+four_det;     // После добавляем это все по формуле и получается детерминант //
        System.out.println("Наша матрица: ");
        for(int xx = 0; xx < matrix.length; xx++){
            for(int yy = 0; yy < matrix.length; yy++) {
                System.out.print(matrix[xx][yy] + " ");                        // Выводим матрицу на экран //
            }
            System.out.println("\n");
        }
        System.out.println("Детерминант: " + determinant);                  // Выводим значение детерминанта //
        /*****************************************************************************************TASK 4*****************/
        int[][] matrixA = new int[3][2];
        int[][] matrixB = new int[2][3];
        int[][] matrixC = new int[3][3];                                   // Создаем 3 массива (1 матрица + 2 матрица = матрица которая выйдет) //
        int x11=1; int x12=2;
        int x21=3; int x22=4;
        int x31=2; int x32=6;
        int b11=0; int b12=-2; int b13=4;
        int b21=1; int b22=3; int b23=2;                                                                                    // Задаем массив переменных //
        for (int hh = 0; hh<matrixC.length;hh++) {                                                                      // Кроме матрицы которая выйдет её задаем всю 0 можно без переменных //
            for (int gg = 0;gg<matrixC.length;gg++) {
                matrixC[hh][gg] = 0;
            }
        }
        matrixA[0][0] = x11; matrixA[0][1] = x12;
        matrixA[1][0] = x21; matrixA[1][1] = x22;
        matrixA[2][0] = x31; matrixA[2][1] = x32;
        System.out.println("MatrixA ------>");                                    // На экран матрицу А //
        for(int aa = 0; aa < 3; aa++) {
            for (int ee = 0; ee < 2; ee++) {
                System.out.print(matrixA[aa][ee] + " ");
            }
            System.out.println("\n");
        } System.out.println("<------------- MatrixA");
        matrixB[0][0] = b11; matrixB[0][1] = a12; matrixB[0][2] = b13;
        matrixB[1][0] = b21; matrixB[1][1] = a22; matrixB[1][2] = b23;
        System.out.println("MatrixB ------>");                              // На экран матрицу В //
        for(int aa = 0; aa < 2; aa++) {
            for (int ee = 0; ee < 3; ee++) {
                System.out.print(matrixB[aa][ee] + " ");
            }
            System.out.println("\n");
        } System.out.print(" <------ MatrixB");
        System.out.println("После умножение эти двух матриц у нас получается матрица С ----->");
        matrixC[0][0] = (x11*b11)+(x12*b21);
        matrixC[0][1] = (x11*b12)+(x12*b22);
        matrixC[0][2] = (x11*b13)+(x12*b23);
        matrixC[1][0] = (x21*b11)+(x22*b21);                                                            // Умножаем матрицу по формуле //
        matrixC[1][1] = (x21*b12)+(x22*b22);
        matrixC[1][2] = (x21*b13)+(x22*b23);
        matrixC[2][0] = (x31*b11)+(x32*b21);                                                        // Можно через for сделать но так понятней //
        matrixC[2][1] = (x31*b12)+(x32*b22);                                                            // Условие свою матрицу умножить, я не больу :) //
        matrixC[2][2] = (x31*b13)+(x32*b23);
        for(int zz = 0; zz < matrixC.length; zz++) {
            for (int ww = 0; ww < matrixC.length; ww++) {
                System.out.print(matrixC[zz][ww] + " ");
            }
            System.out.println("\n");
        } System.out.println("<-------    Ответ ");
        /***************************************************************************************************** TASK 5 **************************/
        int[][][] thirdly = new int[8][8][8];                                      // трёхмерный массив //
        int[][] secondly = new int[8][8];                                           // двухмерный массив //
        for (int jj =0;jj< thirdly.length;jj++) {
            for (int oo =0;oo< thirdly.length;oo++) {
                for (int ll =0;ll< thirdly.length;ll++) {
                    thirdly[jj][oo][ll] = (oo+2)*(ll*3)+(jj+15);                        // присваиваем значение трехмерному массиву //
                }
            }
        }
        for (int jj =0;jj< secondly.length;jj++) {
            for (int oo =0;oo< secondly.length;oo++) {                              // Выбираем с 5ой ячейки тремерного массива значение //
                int delivery = thirdly[5][jj][oo];
                secondly[jj][oo] = delivery;                                        // И присваиваем двух мерному массиву //
            }
        }
        System.out.println("После ввода матрицы 3х3 вырезаем часть 2х2 и присваиваем матрице Secondly   ----->");
        for(int zz = 0; zz < secondly.length; zz++) {
            for (int ww = 0; ww < secondly.length; ww++) {                                                                  // Вывод на экран массива //
                System.out.print(secondly[zz][ww] + " ");
            }
            System.out.println("\n");
        }
    }
    }