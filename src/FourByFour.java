public class FourByFour {
    public static void main(String [] args) {
//code to define an initially empty int 2D array,
//minimum size 4x4
        int [][] list = new int[5][5];


//code to output all original values
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[0][3]);
        System.out.println(list[0][4]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[1][3]);
        System.out.println(list[1][4]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
        System.out.println(list[2][3]);
        System.out.println(list[2][4]);
        System.out.println(list[3][0]);
        System.out.println(list[3][1]);
        System.out.println(list[3][2]);
        System.out.println(list[3][3]);
        System.out.println(list[3][4]);
        System.out.println(list[4][0]);
        System.out.println(list[4][1]);
        System.out.println(list[4][2]);
        System.out.println(list[4][3]);
        System.out.println(list[4][4]);

//code to change half the values to even positive numbers
        list[0][0]=0;
        list[0][2]=2;
        list[0][4]=4;
        list[1][0]=6;
        list[1][2]=8;
        list[1][4]=10;
        list[2][0]=12;
        list[2][2]=14;
        list[2][4]=16;
        list[3][0]=18;
        list[3][2]=20;
        list[3][4]=22;
        list[4][0]=24;
        list[4][2]=26;
        list[4][4]=28;

//and the other half to negative odd numbers
        list[0][1]=-1;
        list[0][3]=-3;
        list[1][1]=-5;
        list[1][3]=-7;
        list[2][1]=-9;
        list[2][3]=-11;
        list[3][1]=-15;
        list[3][3]=-17;
        list[4][1]=-19;
        list[4][3]=-21;


//code to output a blank line separating output sets
        System.out.println();

//code to output all array elements
        System.out.println(list[0][0]);
        System.out.println(list[0][1]);
        System.out.println(list[0][2]);
        System.out.println(list[0][3]);
        System.out.println(list[0][4]);
        System.out.println(list[1][0]);
        System.out.println(list[1][1]);
        System.out.println(list[1][2]);
        System.out.println(list[1][3]);
        System.out.println(list[1][4]);
        System.out.println(list[2][0]);
        System.out.println(list[2][1]);
        System.out.println(list[2][2]);
        System.out.println(list[2][3]);
        System.out.println(list[2][4]);
        System.out.println(list[3][0]);
        System.out.println(list[3][1]);
        System.out.println(list[3][2]);
        System.out.println(list[3][3]);
        System.out.println(list[3][4]);
        System.out.println(list[4][0]);
        System.out.println(list[4][1]);
        System.out.println(list[4][2]);
        System.out.println(list[4][3]);
        System.out.println(list[4][4]);
    }
}


