package practice;

import java.util.LinkedHashMap;



public class test {
	public static void main(String arg[]) {

		//String elementValue = "btn_save#waitForAjax-120:ON:tab";
		/*
		 * 
		 * if (elementValue.contains("waitForAjax")){ String elementValue1 =
		 * elementValue.split(":")[2]; String
		 * residue=elementValue.split("#")[0];
		 * System.out.println(elementValue1); System.out.println(residue); }
		 */
		LinkedHashMap<String, String> elements = new LinkedHashMap<String, String>();
		elements.put("sumit", "ghosh");
		elements.put("sumit1", "ghosh1");
		elements.put("sumit2", "ghosh2");

		System.out.println(elements.get("sumit"));

		boolean istab = false;
		 String elementValue=":tab";
		// istab=elementValue.split(":")[elementValue.split(":").length-1].contains("tab");

	//	System.out.println(Integer.parseInt((elementValue.split("-")[1]).split(":")[0]));
	//	System.out.println(istab);
		
		System.out.println(elementValue.split(":").length);
		System.out.println(elementValue.split(":")[0]);
		String endOperation = elementValue.split(":")[elementValue.split(":").length - 1];
		if (endOperation.equalsIgnoreCase("tab"))
			System.out.println("Y");

		
		

	}
	/*
	 * System.out.println("*************************************");
	 * 
	 * String elementValue1="wait-5:ON:tab"; String elementValue_1 =
	 * elementValue1.split(":")[1]; System.out.println(elementValue_1);
	 * 
	 * 
	 * 
	 * String elementValue="wait-5:ON:tab"; if (elementValue.contains("wait-"))
	 * { String waitInfo = elementValue.split(":")[0]; elementValue =
	 * elementValue.split(":")[1]; int waitTime =
	 * Integer.parseInt(waitInfo.split("-")[1]); System.out.println(
	 * "Waiting for " + waitTime + " seconds.....");
	 * System.out.println(elementValue);
	 * 
	 * }
	 */

}
