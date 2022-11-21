package com.taxitime.driver.Models;

public class ListcheclResponse {
    private boolean error;
    private listcheck listcheck;

    public boolean isError() {
        return error;
    }

    public com.taxitime.driver.Models.listcheck getListcheck() {
        return listcheck;
    }

    public ListcheclResponse(boolean error, com.taxitime.driver.Models.listcheck listcheck) {
        this.error = error;
        this.listcheck = listcheck;
    }
}
