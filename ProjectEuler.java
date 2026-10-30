public class ProjectEuler {


public static int problem1 (int num) {
int result = 0;
int threes = 0;
int fives = 0;
int increment = 0;

while ((increment * 3) < num) {
threes += (increment * 3);
increment ++; }

increment = 0;

while ((increment * 5) < num) {
fives += (increment * 5);
increment ++; }

result = fives + threes;
return result;
}

public static void main(String[] args) {

System.out.println(problem1(1000));

}




}