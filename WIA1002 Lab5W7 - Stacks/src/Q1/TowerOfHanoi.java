package Q1;
import java.util.Stack;

//public class TowerOfHanoi {
//
//    public static void moveDisk(Stack<Integer> src, Stack<Integer> dest, char s, char d) {
//        int pole1Top = src.isEmpty() ? Integer.MAX_VALUE : src.pop();
//        int pole2Top = dest.isEmpty() ? Integer.MAX_VALUE : dest.pop();
//
//        if (pole1Top == Integer.MAX_VALUE) {
//            src.push(pole2Top);
//            System.out.println("Move disk " + pole2Top + " from " + d + " to " + s);
//        } else if (pole2Top == Integer.MAX_VALUE) {
//            dest.push(pole1Top);
//            System.out.println("Move disk " + pole1Top + " from " + s + " to " + d);
//        } else if (pole1Top > pole2Top) {
//            src.push(pole1Top);
//            src.push(pole2Top);
//            System.out.println("Move disk " + pole2Top + " from " + d + " to " + s);
//        } else {
//            dest.push(pole2Top);
//            dest.push(pole1Top);
//            System.out.println("Move disk " + pole1Top + " from " + s + " to " + d);
//        }
//    }
//
//    public static void solve(int n) {
//        Stack<Integer> src = new Stack<>();
//        Stack<Integer> aux = new Stack<>();
//        Stack<Integer> dest = new Stack<>();
//
//        char s = 'A', a = 'B', d = 'C';
//
//        // Initialize source
//        for (int i = n; i >= 1; i--) {
//            src.push(i);
//        }
//
//        int moves = (int) (Math.pow(2, n) - 1);
//
//        if (n % 2 == 0) {
//            char temp = d;
//            d = a;
//            a = temp;
//        }
//
//        for (int i = 1; i <= moves; i++) {
//            if (i % 3 == 1)
//                moveDisk(src, dest, s, d);
//            else if (i % 3 == 2)
//                moveDisk(src, aux, s, a);
//            else
//                moveDisk(aux, dest, a, d);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 3; // number of disks
//        solve(n);
//    }
//}
import java.util.Stack;

public class TowerOfHanoi {
    static Stack<Integer> source = new Stack<>();
    static Stack<Integer> helper = new Stack<>();
    static Stack<Integer> destination = new Stack<>();
    static int step = 1;

    public static void towerOfHanoi(int n, Stack<Integer> src, Stack<Integer> helper, Stack<Integer> destination) {
        if (n > 0) {
            towerOfHanoi(n - 1, src, destination, helper);
            moveDisk(src, destination);
            towerOfHanoi(n - 1, helper, src, destination);
        }
    }

    public static void moveDisk(Stack<Integer> from, Stack<Integer> to) {
        int disk = from.pop();
        to.push(disk);
        System.out.println("Step " + step++ + ": Move disk " + disk + " from " + from + " to " + to);
        System.out.println();
        System.out.println("Source --> "+source);
        System.out.println("helper --> "+helper);
        System.out.println("destination --> "+destination);
        System.out.println();
    }

    public static void main(String args[]) {
        int n = 5;
        // Initialize source rod with disks
        for (int i = n; i > 0; i--) {
            source.push(i);
        }
        System.out.println("Initial State:");
        System.out.println("Source: " + source);
        System.out.println("Helper: " + helper);
        System.out.println("Destination: " + destination);
        System.out.println();
        
        towerOfHanoi(n, source, helper, destination);
    }
}
//
//
//
//                                                    toh(5, S, H, D)
//                                                           |
//            ┌──────────────────────────────────────────────┼──────────────────────────────────────────────┐
//            |                                              |                                              |
//      toh(4, S, D, H)                              moveDisk(S,D)                                    toh(4, H, S, D)
//            |                                      (Move disk 5)                                           |
//      ┌─────┼─────┐                                    |                                            ┌─────┼─────┐
//      |     |     |                                    |                                            |     |     |
// toh(3,S,H,D) move(S,H) toh(3,D,S,H)                   |                                      toh(3,H,D,S) move(H,D) toh(3,S,H,D)
//      |           |                                    |                                            |           |
//   ┌─┼─┐       ┌─┼─┐                                   |                                         ┌─┼─┐       ┌─┼─┐
//   |   |       |   |                                   |                                         |   |       |   |
//toh(2,S,D,H) toh(2,H,S,D)                         toh(2,H,S,D)                               toh(2,H,S,D) toh(2,D,H,S)
//   |           |                                   (Wait, pattern continues...)                    |           |
// ┌─┼─┐       ┌─┼─┐                                                                              ┌─┼─┐       ┌─┼─┐
// |   |       |   |                                                                              |   |       |   |
//toh(1,S,H,D) toh(1,D,S,H)                                                                   toh(1,H,D,S) toh(1,S,H,D)


//Initial State:
//Source: [5,4,3,2,1]  (5 at bottom, 1 on top)
//Helper: []
//Destination: []
//
//Move 1:  Move disk 1 from Source → Destination
//Move 2:  Move disk 2 from Source → Helper
//Move 3:  Move disk 1 from Destination → Helper
//Move 4:  Move disk 3 from Source → Destination
//Move 5:  Move disk 1 from Helper → Source
//Move 6:  Move disk 2 from Helper → Destination
//Move 7:  Move disk 1 from Source → Destination
//Move 8:  Move disk 4 from Source → Helper
//Move 9:  Move disk 1 from Destination → Helper
//Move 10: Move disk 2 from Destination → Source
//Move 11: Move disk 1 from Helper → Source
//Move 12: Move disk 3 from Destination → Helper
//Move 13: Move disk 1 from Source → Destination
//Move 14: Move disk 2 from Source → Helper
//Move 15: Move disk 1 from Destination → Helper
//Move 16: Move disk 5 from Source → Destination
//Move 17: Move disk 1 from Helper → Source
//Move 18: Move disk 2 from Helper → Destination
//Move 19: Move disk 1 from Source → Destination
//Move 20: Move disk 3 from Helper → Source
//Move 21: Move disk 1 from Destination → Helper
//Move 22: Move disk 2 from Destination → Source
//Move 23: Move disk 1 from Helper → Source
//Move 24: Move disk 4 from Helper → Destination
//Move 25: Move disk 1 from Source → Destination
//Move 26: Move disk 2 from Source → Helper
//Move 27: Move disk 1 from Destination → Helper
//Move 28: Move disk 3 from Source → Destination
//Move 29: Move disk 1 from Helper → Source
//Move 30: Move disk 2 from Helper → Destination
//Move 31: Move disk 1 from Source → Destination
//
//Final State:
//Source: []
//Helper: []
//Destination: [5,4,3,2,1]

//Call 1: toh(5, S, H, D)
//  Call 2: toh(4, S, D, H)
//    Call 3: toh(3, S, H, D)
//      Call 4: toh(2, S, D, H)
//        Call 5: toh(1, S, H, D)
//          Call 6: toh(0, S, D, H) → returns
//          Move 1: moveDisk(S, D)  // Moves disk 1 from S to D
//          Call 7: toh(0, H, S, D) → returns
//        // Back in Call 4
//        Move 2: moveDisk(S, H)     // Moves disk 2 from S to H
//        Call 8: toh(1, D, S, H)
//          Call 9: toh(0, D, H, S) → returns
//          Move 3: moveDisk(D, H)   // Moves disk 1 from D to H
//          Call 10: toh(0, S, D, H) → returns
//      // Back in Call 3
//      Move 4: moveDisk(S, D)       // Moves disk 3 from S to D
//      Call 11: toh(2, H, S, D)
//        Call 12: toh(1, H, D, S)
//          Call 13: toh(0, H, S, D) → returns
//          Move 5: moveDisk(H, S)   // Moves disk 1 from H to S
//          Call 14: toh(0, D, H, S) → returns
//        Move 6: moveDisk(H, D)     // Moves disk 2 from H to D
//        Call 15: toh(1, S, H, D)
//          Call 16: toh(0, S, D, H) → returns
//          Move 7: moveDisk(S, D)   // Moves disk 1 from S to D
//          Call 17: toh(0, H, S, D) → returns
//    // Back in Call 2
//    Move 8: moveDisk(S, H)         // Moves disk 4 from S to H
//    Call 18: toh(3, D, S, H)
//      // Continues similarly for disks 3,2,1...
