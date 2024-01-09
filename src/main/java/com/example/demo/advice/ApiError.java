package com.example.demo.advice;

import java.util.Date;

public class ApiError {
    private Integer errorCode;
    private String details;
    private Date date;

    public ApiError(Integer errorCode, String details, Date date) {
        this.errorCode = errorCode;
        this.details = details;
        this.date = date;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
