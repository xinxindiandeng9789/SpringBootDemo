package com.example.demo.pojo;

import java.math.BigDecimal;

public class Score extends ScoreKey {
    private BigDecimal degree;

    public BigDecimal getDegree() {
        return degree;
    }

    public void setDegree(BigDecimal degree) {
        this.degree = degree;
    }
}