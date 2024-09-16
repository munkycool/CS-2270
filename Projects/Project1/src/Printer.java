public class Printer {

    private int trayCapacity;
    private int pagesAvailable;
    private int totalPagesPrinted;
    private boolean isTrayRemoved;
    private int nextPage = 0;
    private int documentPages;
    private int beforeTrayRemoval;

    public Printer(int trayCapacity) {
        this.trayCapacity = trayCapacity;
    }

    public void startPrintJob(int documentPages) {
        this.documentPages = documentPages;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getTotalPages() {
        return totalPagesPrinted;
    }

    public void printPage() {
        if (pagesAvailable <= 0) {
            return;
        }
        pagesAvailable--;
        totalPagesPrinted++;
        nextPage++;
        documentPages--;
        if (documentPages <= 0) {
            startPrintJob(documentPages);
            nextPage = 0;
        }
    }

    public void removeTray() {
        beforeTrayRemoval = pagesAvailable;
        pagesAvailable = 0;
        isTrayRemoved = true;
    }

    public void replaceTray() {
        pagesAvailable = beforeTrayRemoval;
        isTrayRemoved = false;
    }

    public void addPaper(int sheets) {
        pagesAvailable = Math.min(trayCapacity, pagesAvailable + sheets);
    }

    public void removePaper(int sheets) {
        isTrayRemoved = true;
        pagesAvailable = Math.max(0, pagesAvailable - sheets);
    }
    public int getSheetsAvailable() {
        return pagesAvailable;
    }
}
