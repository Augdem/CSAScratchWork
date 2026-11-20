public class Xor1 {
public static void main(String[] args)
{
System.out.println(Babble(6));
}

public static String Babble(int repeat) {
String string1 = "";
for (int i = 1; i <= repeat; i++)
{
if (i < repeat) {
string1 += (Multiples((int)(Math.random() * 100) + 1, (int)(Math.random() * 100) + 1, (int)(Math.random() * 10) + 1) + "-");
} else { 
string1 += repeat;
}
}

return string1;
}


public static int Multiples(int num1, int num2, int multiple) {
int output = 0;
int primes = 0;

int range = Math.abs(num1 - num2) + 1;
for (int i = 1; i <= range; i++)
{
if (num1 < num2) {
if ((num1 + (i - 1)) % multiple == 0)
{
output++;
}
} else if ((num2 + (i - 1)) % multiple == 0) {
output++;
}
}
return output;
}
}