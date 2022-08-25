public class riskAnalysis {
    private String name;
    private int probability;
    private int cons;
    private int riskNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getCons() {
        return cons;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public int getProbability() {
        return probability;
    }

    public void setRiskNumber(int riskNumber) {
        this.riskNumber = riskNumber;
    }

    public int getRiskNumber() {
        return riskNumber;
    }
}
