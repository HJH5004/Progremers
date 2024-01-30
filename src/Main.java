import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
* Rule 1. Client는 임의의 '숫자'를 입력한다.
* Rule 2. 정사각형의 한 변의 길이는 n이다.
* Rule 3. 가로변은  m번째 줄에서 m+(n*0), m+(n*1), m+(n*2)... 순으로 늘어난다.
* */
public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        try{
            //Rule 1. 사용자는 임의의 '숫자'를 입력한다.
            int num = input1.nextInt();

            List<String> values = new ArrayList<>();
            String value = "";

            // Rule 2. 정사각형의 한 변의 길이는 n 이다.
            for(int i=1; i<=num; i++){
                // Rule 3. 가로변은  m번째 줄에서 m+(n*0), m+(n*1), m+(n*2)... 순으로 늘어난다.
                for (int a=0; a<num; a++){
                    if(a==0){
                        value = value+i;
                    } else {
                        value = value + " "+ (i+(num*a));
                    }
                }

                //값 초기화.
                values.add(value);
                value = "";
            }

            for(String result : values){
                System.out.println(result);
            }
        } catch (Exception e){
            System.out.println("숫자만 입력하세요. 다시 시작하세요");
        }

    }
}