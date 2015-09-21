package org.bondapp.domain;

public class Bond {

    private final long id;
    private String isin;
    private String issuer;
    private long releaseDate;
    private long repaymentDate;
    private double rating;
    private double outstandingNominal;
    private double profitability;
    private double duration;
    private double roe;

    public Bond(long id, String content) {
        this.id = id;

    }

    public long getId() {
        return id;
    }

    public String getIsin() {
        return isin;
    }

    public String getIssuer() {
        return issuer;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public long getRepaymentDate() {
        return repaymentDate;
    }

    public double getRating() {
        return rating;
    }

    public double getOutstandingNominal() {
        return outstandingNominal;
    }

    public double getProfitability() {
        return profitability;
    }

    public double getDuration() {
        return duration;
    }

    public double getRoe() {
        return roe;
    }
}
