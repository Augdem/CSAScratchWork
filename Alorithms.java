public class Alorithms {

public static void main(String[] args) { 
System.out.println(sumAllNumbersLessThan(10));
System.out.println(sumAllNumbersLessThan2(10));
}

public static int sumAllNumbersLessThan(int num) {

num = num - 1;
num = (num * (num + 1)) / 2;
return num;


}

public static int sumAllNumbersLessThan2(int num) {

int value = 0;

for (int i = 1; i < num; i++) {
value += i;
}
return value;
}
}