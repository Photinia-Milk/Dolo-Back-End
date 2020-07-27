package sjtu.dolo.model;

import java.math.BigDecimal;

public class GpaVO {
    private BigDecimal avgGrade;
    private BigDecimal avgGpa;

    public BigDecimal getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(BigDecimal avgGrade) {
        this.avgGrade = avgGrade;
    }

    public BigDecimal getAvgGpa() {
        return avgGpa;
    }

    public void setAvgGpa(BigDecimal avgGpa) {
        this.avgGpa = avgGpa;
    }
}
