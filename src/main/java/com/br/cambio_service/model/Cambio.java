package com.br.cambio_service.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cambio implements Serializable {
    private static final long serialVersionUID = 1L;

    private long  id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private BigDecimal convertedValue;
    private String environment;

    public Cambio(long id, String from, String to, BigDecimal conversionFactor, BigDecimal convertedValue, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.convertedValue = convertedValue;
        this.environment = environment;
    }
    public Cambio() {
    }

    public long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cambio cambio)) return false;
        return getId() == cambio.getId() && Objects.equals(getFrom(), cambio.getFrom()) && Objects.equals(getTo(), cambio.getTo()) && Objects.equals(getConversionFactor(), cambio.getConversionFactor()) && Objects.equals(getConvertedValue(), cambio.getConvertedValue()) && Objects.equals(getEnvironment(), cambio.getEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFrom(), getTo(), getConversionFactor(), getConvertedValue(), getEnvironment());
    }
}
