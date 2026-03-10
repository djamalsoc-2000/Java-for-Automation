package myown;

public class jamal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2000;
		
		String companyName = "ExecuteAutomation Ltd";
		String ownerName = "Macdonald";
		
        //System.out.print(companyName.concat(ownerName));
		
        System.out.println(companyName.split(" ")[1]);
        
        String replacedValue = companyName.replace("Ltd","Pvt Ltd" );
        System.out.println(replacedValue);
	}

}
