package org.bondapp.domain;

public class Bond {

    private final String isin;
    private final String issuer;
    private final long releaseDate;
    private final long repaymentDate;

    private double rating;
    private double outstandingNominal;

    public Bond(String isin, String issuer, long releaseDate, long repaymentDate) {
        this.isin = isin;
        this.issuer = issuer;
        this.releaseDate = releaseDate;
        this.repaymentDate = repaymentDate;
        rating = 1;
        outstandingNominal = 1;
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
        return dateInMillis * 0.2;
    }

    public double getDuration(long dateInMillis) {
        return dateInMillis * 0.3;
    }

    public double getRoe(long dateInMillis) {
        return dateInMillis * 0.4;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setOutstandingNominal(double outstandingNominal) {
        this.outstandingNominal = outstandingNominal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bond bond = (Bond) o;

        return isin.equals(bond.isin);

    }

    @Override
    public int hashCode() {
        return isin.hashCode();
    }
}
