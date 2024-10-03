package com.tcs.bank.util;


import com.tcs.bank.models.Response;

import java.util.List;

public final class BankUtils {

    public static Response mapResponse(Response response, List<Object> data, String message) {
        response.setCode(200);
        response.setMessage(message);
        response.setData(data);
        return response;
    }
}
