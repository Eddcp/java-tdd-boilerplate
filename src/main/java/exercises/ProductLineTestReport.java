package exercises;

class ProductLineTestReport {
    long correctCnt;
    long checkedExCnt;
    long uncheckedExcCnt;
    long otherExcCnt;

    public ProductLineTestReport(long correctCnt, long checkedExCnt, long uncheckedExcCnt, long otherExcCnt) {
        this.correctCnt = correctCnt;
        this.checkedExCnt = checkedExCnt;
        this.uncheckedExcCnt = uncheckedExcCnt;
        this.otherExcCnt = otherExcCnt;
    }
}
