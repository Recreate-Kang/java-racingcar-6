package racingcar;
import java.util.*;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    	Try_Numb();
    	//Run(Car_Names(),Try_Numb());
    }
    	
    
    //실행 문서//
    public static void Run(List<String> Car_Names, Integer Try_Numb) {
    	
    }
    
    //차량 이름//
    public static String[] Car_Names() {
    	System.out.println("경주할 자동차 이름을 입력하세요.(이름은(,쉼표) 기준으로 구");
    	String[] Car_Names = Console.readLine().split(",");
    	Names_ErrCheck(Car_Names);
    	return Car_Names;
    }
    public static void Names_ErrCheck(String[] Car_Names) {
    	
    }
    
    
    //시도 횟수//
    public static Integer Try_Numb() {
    	System.out.println("시도할 회수는 몇회인가요?")
    	//Integer Try_numb = Randoms.pickNumberInRange(1, 9);
    	//System.out.print(Try_numb);
    	return Try_numb;
    }
    
    
}
