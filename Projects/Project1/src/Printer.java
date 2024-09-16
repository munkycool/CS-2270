/*
 * Copyright (c) 2024.
 * Project1 created by Artemis Tack
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

/**
 * This class represents a printer that can print documents.
 *
 * @author Artemis Tack
 * @version 69.420
 *
 * This code is licensed under the GPL v3.0 license.
 */
public class Printer {

    private int trayCapacity;
    private int pagesAvailable;
    private int totalPagesPrinted;
    private int nextPage = 0;
    private int documentPages;
    private int beforeTrayRemoval;

    /**
     * Creates a new printer with the given paper tray capacity.
     *
     * @param trayCapacity the capacity of the paper tray
     */
    public Printer(int trayCapacity) {
        this.trayCapacity = trayCapacity;
    }

    /**
     * Starts a print job with the given number of pages.
     *
     * @param documentPages the number of pages in the document to be printed
     */
    public void startPrintJob(int documentPages) {
        this.documentPages = documentPages;
        nextPage = 0;
    }

    /**
     * Returns the number of the next page to be printed.
     *
     * @return the number of the next page to be printed
     */
    public int getNextPage() {
        return nextPage;
    }

    /**
     * Returns the total number of pages printed so far.
     *
     * @return the total number of pages printed so far
     */
    public int getTotalPages() {
        return totalPagesPrinted;
    }

    /**
     * Prints the next page in the print job.
     * If there are no pages available, the method returns immediately.
     */
    public void printPage() {
       //if (pagesAvailable <= 0) {
       //     return;
        //}
        double i = Math.min(pagesAvailable, 1);

        pagesAvailable -=i;
        totalPagesPrinted += i;
        nextPage +=i;
        documentPages -=i;

//        if (documentPages <= 0) {
//            nextPage = 0;
//        }

        nextPage = nextPage % Math.max(documentPages,1);
    }

    /**
     * Removes the paper tray from the printer.
     */
    public void removeTray() {
        beforeTrayRemoval = pagesAvailable;
        pagesAvailable = 0;
    }

    /**
     * Replaces the paper tray in the printer.
     */
    public void replaceTray() {
        pagesAvailable = beforeTrayRemoval;
    }

    /**
     * Adds the given number of sheets of paper to the printer.
     *
     * @param sheets the number of sheets to add
     */
    public void addPaper(int sheets) {
        pagesAvailable = Math.min(trayCapacity, pagesAvailable + sheets);
    }

    /**
     * Removes the given number of sheets of paper from the printer.
     *
     * @param sheets the number of sheets to remove
     */
    public void removePaper(int sheets) {
        pagesAvailable = Math.max(0, pagesAvailable - sheets);
    }

    /**
     * Returns the number of sheets of paper available in the printer.
     *
     * @return the number of sheets of paper available
     */
    public int getSheetsAvailable() {
        return pagesAvailable;
    }
}