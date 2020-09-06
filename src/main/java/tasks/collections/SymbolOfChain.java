package tasks.collections;

public class SymbolOfChain {
    public String incString;

    public void setIncString(String incString) {
        this.incString = incString;
    }

    public SymbolOfChain(String incString) {
        this.incString = incString;
    }
    public boolean checkOpenBracket() {
        return incString.equals("(") || incString.equals("{") || incString.equals("[");
    }
    public boolean checkCloseBracket() {
        return incString.equals(")") || incString.equals("}") || incString.equals("]");
    }
    public boolean checkOppositeBracket(String incString, String outstring) {
        return (incString.equals(")") && outstring.equals("(")) || (incString.equals("}") && outstring.equals("{"))
                || (incString.equals("]") && outstring.equals("["));
    }
}
