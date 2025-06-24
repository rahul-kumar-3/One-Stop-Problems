/*13_ChessboardCellColor */

/*  
8 w b w b w b w b 
7 b w b w b w b w
6 w b w b w b w b 
5 b w b w b w b w
4 w b w b w b w b 
3 b w b w b w b w
2 w b w b w b w b 
1 b w b w b w b w
  a b c d e f g h


Above is the standard representation of a chessboard.
This could be imagined as a 2D cartesian plane, with the x axis being represented by the alphabets and y axis by the numbers.
Given coordinates in the form of string, print if that cell is white or black.

Testcase Input
b2
Testcase Output
Black


*/
import java.util.*;
public class Chess_Board_Cell_Color_Checker{
    public static String isWhiteCell(String s){
        if(s.charAt(0)%2 == 0 && s.charAt(1)%2 != 0){
            return "White";
        }
        else if(s.charAt(0)%2 != 0 && s.charAt(1)%2 == 0){
            return "White";
        }

        return "Black";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); // taking string inputand trim with space
        sc.close();
        String result = isWhiteCell(s);
        System.out.println(result);

    }
}