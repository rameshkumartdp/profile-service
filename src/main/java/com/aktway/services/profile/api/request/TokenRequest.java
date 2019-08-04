package com.aktway.services.profile.api.request;

import com.google.common.base.Objects;
import java.io.Serializable;

public class TokenRequest implements Serializable {

    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenRequest cpRequest = (TokenRequest) o;
        return Objects.equal(accessToken, cpRequest.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accessToken);
    }

    @Override
    public String toString() {
        return "accessToken " + accessToken;
    }
}
