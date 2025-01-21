package ru.jvmbrain;

import java.math.BigDecimal;

public class WorkDay {

    private Boolean isDayOff;
    private BigDecimal scale;

    public Boolean isDayOff() {
        return isDayOff;
    }

    public void setDayOff(Boolean dayOff) {
        isDayOff = dayOff;
    }

    public BigDecimal getScale() {
        return scale;
    }

    public void setScale(BigDecimal scale) {
        this.scale = scale;
    }
}
