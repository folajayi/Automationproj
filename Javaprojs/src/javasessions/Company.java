package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	//WAF
	//name: get company information
	//input param : compName(string)
	//return: name, Banglore,1000, 5.5, tom -- object static array
	public Object[] getCompanyInfo(String compName) {
		System.out.println("getting info : + compName");
		Object info [] = new Object[5];
		
		if(compName.equals("IBM")) {
			info[0] = "IBM";
			info[1] = 1000;
			info[2] = 5.5;
			info[3] = "Banglore";
			info[4] = "Tom";
		}
		else if(compName.equals("MS")) {
			info[0] = "MS";
			info[1] = 2000;
			info[2] = 6.5;
			info[3] = "HYD";
			info[4] = "Peter";
		}
		else {
			System.out.println("company name is not found....");
		}
		return info;
		
		}
	//WAF
	//name
	//input
	//return; list of product: 
	public ArrayList<String> getProductList(String compName) {
		System.out.println("getting product list for: " + compName);
		ArrayList<String> prodList = new ArrayList<String>();
		
		switch (compName.toLowerCase()) {
		case "amazon":
			prodList.add("macbook");
			prodList.add("samsung");
			prodList.add("hp");
			break;
		case "walmart":
			prodList.add("nike");
			prodList.add("rebok");
			prodList.add("adidas");
			break;
		case "flipkart":
			prodList.add("zara");
			prodList.add("h&m");
			prodList.add("h&b");
			
			break;

		default:
			System.out.println("company is not found.... "+ compName);
			break;
		}
		return prodList;
	}
	

	public static void main(String[] args) {
		Company obj = new Company();
		ArrayList<String> amzList = obj.getProductList("Amazon");
		System.out.println(amzList);
		System.out.println("amazon product count: " + amzList.size());
		ArrayList<String> wmList = obj.getProductList("Walmart");
		System.out.println(wmList);
		ArrayList<String> sdList = obj.getProductList("snapDeal");
		System.out.println(sdList);
		
		
		
		Object comp[] = obj.getCompanyInfo("MS");
		System.out.println(Arrays.toString(comp));
		
		}

	

}
