package com.chrisdoyle.timeismoney;

public class RateRecord {

    private RateType rateType;
    private String time;
    private double recordValue;

    public RateRecord(RateType rateType, String time, double recordValue) {
        this.rateType = rateType;
        this.time = time;
        this.recordValue = recordValue;
    }

    public RateType getRateType() {
        return rateType;
    }

    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getRecordValue() {
        return recordValue;
    }

    public void setRecordValue(double recordValue) {
        this.recordValue = recordValue;
    }
}
