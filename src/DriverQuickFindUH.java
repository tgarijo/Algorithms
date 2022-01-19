import java.util.Scanner;

/* dynamic connectivity and quiz-find
    Applications involve manipulating objects of all types.
    Pixels in a digital photo.
    Computers in a network.
    Friends in a social network.
    Transistors in a computer chip.
    Elements in a mathematical set.
    Variable names in Fortran program.
    Metallic sites in a composite system.
*/

public class DriverQuickFindUH {
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            String input = "";
                  
            int N = in.nextInt();
     
            QuickFindUF uf = new QuickFindUF(N);
            do {
                input = in.next();
                int p = Integer.parseInt(input);
                input = in.next();
                int q = Integer.parseInt(input);
                if(!uf.connected(p, q))
                {
                    uf.union(p, q);
                    System.out.println(p + " " + q);
                }
            } while (!input.isEmpty());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
    }
}


/* 
0 1 2 3 4 5 6 7 8 9 [4,3]
0 1 2 3 3 5 6 7 8 9 [3,8]
0 1 2 8 8 5 6 7 8 9 [6,5]
0 1 2 8 8 5 5 7 8 9 [9,4]
0 1 2 8 8 5 5 7 8 8 [2,1]
0 1 1 8 8 5 5 7 8 8 [8,9]
0 1 1 8 8 5 5 7 8 8 [5,0]
0 1 1 8 8 0 0 7 8 8 [7,2]
0 1 1 8 8 0 0 1 8 8 [6,1]
1 1 1 8 8 1 1 1 8 8 [1,0]
1 1 1 8 8 1 1 1 8 8 [6,7]
1 1 1 8 8 1 1 1 8 8
*/
