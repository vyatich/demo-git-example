package ru.jvmbrain;

import java.math.BigDecimal;

public class IfElseExample {

    private static final WorkDayService workDayService = new WorkDayService();

    public static void main(String[] args) {
        User user = new User(BigDecimal.valueOf(120000));
        WorkDay workDay = workDayService.getWorkDayByUser(user);

        BigDecimal rate = getUserRate(workDay, user);
        System.out.println(rate);
    }

    private static BigDecimal getUserRate(WorkDay workDay, User user) {
        if (workDay.isDayOff()) {
            return workDay.getScale().multiply(user.getDayRate());
        }
        return user.getDayRate();
    }
}
