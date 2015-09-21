package org.bondapp.domain;

public class BondDto {
    private String isin;
    private String issuer;
    private long releaseDate;
    private long repaymentDate;

    private double rating;
    private double outstandingNominal;

    private double profitability;
    private double duration;
    private double roe;

    public BondDto(Bond bond, long dateInMillis) {
        this.isin = bond.getIsin();
        this.issuer = bond.getIssuer();
        this.releaseDate = bond.getReleaseDate();
        this.repaymentDate = bond.getRepaymentDate();
        this.rating = bond.getRating();
        this.outstandingNominal = bond.getOutstandingNominal();
        this.profitability = bond.getProfitability(dateInMillis);
        this.duration = bond.getDuration(dateInMillis);
        this.roe = bond.getRoe(dateInMillis);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BondDto bondDto = (BondDto) o;

        return isin.equals(bondDto.isin);

    }

    @Override
    public int hashCode() {
        return isin.hashCode();
    }
}
