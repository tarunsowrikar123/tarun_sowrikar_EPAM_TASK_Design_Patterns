import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
public static void main(String[] args) throws IOException{
	GetPlanFactory planFactory = new GetPlanFactory();
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the name of the plan ");
	String planName = bufferedReader.readLine();
	System.out.println("Enter the number of units");
	int units = Integer.parseInt(bufferedReader.readLine());
	Plan plan = planFactory.getPlan(planName);
	System.out.print("Bill Amount  : ");
	plan.getRate();
	plan.calculateBill(units);
}
}
