package com.tymit.rules.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Collectors;

@Getter
public enum ProductType {
    TYMIT_CREDIT("tymit-credit"),
    BOOSTER_CREDIT("booster-credit");

    public final String value;

    ProductType(String value) {
        this.value = value;
    }

    public static ProductType findBy(String value) {
        return Arrays.stream(ProductType.values())
                .filter(v -> v.value.equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(String.format("Unsupported Product type '%s'. " +
                        "The supported values are: %s.", value, Arrays.stream(values()).map(e -> e.value).collect(Collectors.toList()))));
    }
}
