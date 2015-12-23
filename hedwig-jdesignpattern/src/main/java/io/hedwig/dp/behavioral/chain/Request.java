package io.hedwig.dp.behavioral.chain;

import com.google.common.base.MoreObjects;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class Request {
    private String requestDescription;
    private RequestType requestType;

    public Request(String requestDescription, RequestType requestType) {
        this.requestDescription = requestDescription;
        this.requestType = requestType;
    }


    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("requestDescription", requestDescription)
                .add("requestType", requestType)
                .toString();
    }
}
