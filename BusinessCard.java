public class BusinessCard {

	public static void main(String[] args)
	{
		// Define colors and reset variables:
		String reset = "\u001B[0m";
		String purple = "\u001B[35m";
		String yellow = "\u001B[33m";

		// Define card variables:
		String fullName = "Tony DeStefano";
		String jobTitle = "Future Java Dev";
		String phoneNumber = "509-499-5878";
		String email = "spokanetony@gmail.com";

		// Print out the card details:
		System.out.println("---------------------------------------------");
		System.out.println("|  " + purple + "/  /" + reset + "                      " + fullName + " |");
		System.out.println("| " + purple + "/  /" + reset + "                      " + jobTitle + " |");
		System.out.println("|" + purple + "/  /" + yellow + "--------------------------------------" + purple + "/" + reset + "|");
		System.out.println("|  " + purple + "/" + yellow + "---- " + purple + "F" + yellow + " ----------- " + purple + "" + purple + "N" + yellow + " ---------- " + purple + "O" + yellow + " ----" + purple + "/" + reset + " |");
		System.out.println("| " + purple + "/" + yellow + "------------ " + purple + "U" + yellow + " ----------- " + purple + "K" + yellow + " ---------" + purple + "/" + reset + "  |");
		System.out.println("|" + purple + "/" + yellow + "--------------------------------------" + purple + "/  /" + reset + "|");
		System.out.println("| " + phoneNumber + "                         " + purple + "/  /" + reset + " |");
		System.out.println("| " + email + "               " + purple + "/  /" + reset + "  |");
		System.out.println("---------------------------------------------");
	}
}