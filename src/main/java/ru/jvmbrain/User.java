package ru.jvmbrain;

import java.math.BigDecimal;

public class User {

    private BigDecimal dayRate;
    private WorkDay workDay;

    public User(BigDecimal dayRate) {
        this.dayRate = dayRate;
    }

    public BigDecimal getDayRate() {
        return dayRate;
    }

    public void setDayRate(BigDecimal dayRate) {
        this.dayRate = dayRate;
    }

    public WorkDay getWorkDay() {
        return workDay;
    }

    public void setWorkDay(WorkDay workDay) {
        this.workDay = workDay;
    }
}
