package com.github.silexmc.money.api;

import java.math.BigDecimal;
import java.util.UUID;

public interface MoneyAPI {
    BigDecimal getMoney(UUID uniqueID);

    String getStringMoney(UUID uniqueID);

    String getFormatMoney(UUID uniqueID);

    BigDecimal getTotalMoney(UUID uniqueID);

    String getStringTotalMoney(UUID uniqueID);

    String getFormatTotalMoney(UUID uniqueID);

    void setMoney(UUID uniqueID, BigDecimal money);

    default void setMoney(UUID uniqueID, Double money) {
        this.setMoney(uniqueID, BigDecimal.valueOf(money));
    }

    void giveMoney(UUID uniqueID, BigDecimal money);

    default void giveMoney(UUID uniqueID, Double money) {
        this.giveMoney(uniqueID, BigDecimal.valueOf(money));
    }

    void takeMoney(UUID uniqueID, BigDecimal money);

    default void takeMoney(UUID uniqueID, Double money) {
        this.takeMoney(uniqueID, BigDecimal.valueOf(money));
    }

    boolean hasMoney(UUID uniqueID, BigDecimal money);

    default boolean hasMoney(UUID uniqueID, Double money) {
        return this.hasMoney(uniqueID, BigDecimal.valueOf(money));
    }
}
