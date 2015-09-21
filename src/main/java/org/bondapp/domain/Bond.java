package org.bondapp.domain;

public class Bond {

    private final String isin;
    private final String issuer;
    private final long releaseDate;
    private final long repaymentDate;

    private double rating;
    private double outstandingNominal;

    public Bond( String isin, String issuer, long releaseDate, long repaymentDate) {

        this.isin = isin;
        this.issuer = issuer;
        this.releaseDate = releaseDate;
        this.repaymentDate = repaymentDate;
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

    public double getProfitability(long dateInMillis) {
        return dateInMillis * 2;
    }

    public double getDuration(long dateInMillis) {
        return dateInMillis * 3;
    }

    public double getRoe(long dateInMillis) {
        return dateInMillis * 4;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setOutstandingNominal(double outstandingNominal) {
        this.outstandingNominal = outstandingNominal;
    }
}
