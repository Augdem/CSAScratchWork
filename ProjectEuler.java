public class ProjectEuler {


public static int problem1 (int num) {
int result = 0;
int increment = 0;

while (increment < num)
{

if (increment % 3 == 0 || increment % 5 == 0) {
result += increment;
increment++;
} else {
increment++;
}


}

return result;
}

public static void main(String[] args) {

System.out.println(problem1(1000));

}




}