package com.github.silexmc.money.api;

import java.math.BigInteger;
import java.util.UUID;

public interface MoneyAPI {
    BigInteger getMoney(UUID uniqueID);

    String getFormatMoney(UUID uniqueID);

    String getStringMoney(UUID uniqueID);

    BigInteger getTotalMoney(UUID uniqueID);

    String getFormatTotalMoney(UUID uniqueID);

    String getStringTotalMoney(UUID uniqueID);

    void setMoney(UUID uniqueID, BigInteger value);

    void giveMoney(UUID uniqueID, BigInteger value);

    void takeMoney(UUID uniqueID, BigInteger value);

    boolean hasMoney(UUID uniqueID, BigInteger value);

    default void setMoney(UUID uniqueID, Integer value) {
        this.setMoney(uniqueID, BigInteger.valueOf(value));
    }

    default void giveMoney(UUID uniqueID, Integer value) {
        this.giveMoney(uniqueID, BigInteger.valueOf(value));
    }

    default void takeMoney(UUID uniqueID, Integer value) {
        this.giveMoney(uniqueID, BigInteger.valueOf(value));
    }

    default boolean hasMoney(UUID uniqueID, Integer value) {
        return this.hasMoney(uniqueID, BigInteger.valueOf(value));
    }
}
