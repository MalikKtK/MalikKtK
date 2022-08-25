
public class testRisk {
    riskAnalysis malik = new riskAnalysis();
    void beregnRisk() {
        malik.setRiskNumber(malik.getCons()*malik.getProbability());
    }
    void go() {
    }

    public static void main(String[] args) {
        testRisk execute = new testRisk();
        execute.go();
        execute.beregnRisk();
    }
}
