/*
 * Copyright (c) 2024.
 * Project1 created by $user
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class Main {

    public void testPrinterWithTrayRemovalAndPaperOperations() {
        Printer printer = new Printer(10); // Create a printer with capacity 10
        printer.addPaper(8); // Add 8 papers
        printer.removeTray(); // Remove the tray
        printer.addPaper(2); // Add 2 papers
        printer.removePaper(3); // Remove 3 papers

        // Sheets available should be 7
        System.out.println("Test 1: " + printer.getSheetsAvailable());
    }
}