public class Operators {
    public static void main (String[] args){
    // bitwise operators
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (a & b)); // 0001 in binary, output: 1
        System.out.println("Bitwise OR: " + (a | b)); // 0111 in binary, output: 7
        System.out.println("Bitwise XOR: " + (a ^ b)); // 0110 in binary, output: 6
        System.out.println("Bitwise NOT: " + (~a)); // 1010 in binary, output: -6
        System.out.println("Left Shift: " + (a << 1)); // 1010 in binary, output: 10
        System.out.println("Right Shift: " + (a >> 1)); // 0010
        

    }

    
}
