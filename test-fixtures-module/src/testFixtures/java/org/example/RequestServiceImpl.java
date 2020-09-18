package org.example;

public class RequestServiceImpl implements RequestService {

    private RequestHelper requestHelper = new RequestHelperImpl();

    @Override
    public String getValue() {
        return requestHelper.getValue();
    }

}
