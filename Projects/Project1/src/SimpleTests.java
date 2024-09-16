/**
 * A few simple tests for the Printer class.
 */
public class SimpleTests {
	public static void main(String[] args) {
		// Test 1: create a printer
		Printer p = new Printer(100);
		System.out.println("Test 1: " + p.getSheetsAvailable());
		System.out.println("Test 2: Expected 0");
		p.addPaper(1);
		System.out.println("Test 3: " + p.getSheetsAvailable());
		System.out.println("Test 4: Expected 1");
		System.out.println("Test 5: " + p.getTotalPages());
		System.out.println("Test 6: Expected 0");

		// Test 2: start a job and print a page
		p.startPrintJob(5);
		System.out.println("Test 7: " + p.getNextPage());
		System.out.println("Test 8: Expected 0");
		p.printPage();
		System.out.println("Test 9: " + p.getNextPage());
		System.out.println("Test 10: Expected 1");
		System.out.println("Test 11: " + p.getTotalPages());
		System.out.println("Test 12: Expected 1");

		// Test 3: try to print a page with no paper available
		p.printPage();
		System.out.println("Test 13: " + p.getTotalPages());
		System.out.println("Test 14: Expected 1");

		// Test 4: add paper and try to print again
		p.addPaper(200);
		System.out.println("Test 15: " + p.getSheetsAvailable());
		System.out.println("Test 16: Expected 100");
		p.printPage();
		System.out.println("Test 17: " + p.getTotalPages());
		System.out.println("Test 18: Expected 2");
		System.out.println("Test 19: " + p.getNextPage());
		System.out.println("Test 20: Expected 2");

		// Test 5: print the rest of the 5 page document
		p.printPage();
		p.printPage();
		p.printPage();
		System.out.println("Test 21: " + p.getNextPage());
		System.out.println("Test 22: Expected 0");
		System.out.println("Test 23: " + p.getSheetsAvailable());
		System.out.println("Test 24: Expected 96");

		// Test 6: remove the paper tray, try to print, and then replace the tray
		p.removeTray();
		System.out.println("Test 25: " + p.getSheetsAvailable());
		System.out.println("Test 26: Expected 0");
		p.printPage();
		p.replaceTray();
		System.out.println("Test 27: " + p.getSheetsAvailable());
		System.out.println("Test 28: Expected 96");

		// Test 7: remove paper and add paper
		p.removePaper(100);
		p.addPaper(1);
		System.out.println("Test 29: " + p.getSheetsAvailable());
		System.out.println("Test 30: Expected 1");
	}
}