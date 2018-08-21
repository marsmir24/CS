public class Level_C_Hex {
public static void main(String[] args) {
for (byte i= 0; i!= -1; i++) {
String binary = Integer.toHexString(i);
if (binary.length()>8) binary=binary.substring(binary.length()-8);
binary = String.format("%8s", binary).replace(" ", "0");
System.out.printf("%8s %4d %n",binary, i);
}
}
}