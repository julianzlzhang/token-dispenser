package com.github.yeriomin.tokendispenser;
import com.github.yeriomin.playstoreapi.DetailsResponse;

import java.io.IOException;

public class TestApi extends TokenAc2dmResource {
    @Override
    protected String getToken(String email, String password) throws IOException {
        return getApi().generateToken(email, password);
    }

    public static void main(String[] args) throws IOException {
        testGetToken();
    }

    static void testGetToken() throws IOException {
        TestApi r = new TestApi();
        String token = r.getToken(Consts.GOOGLE_USER, Consts.GOOGLE_PASSWORD);
        System.out.println(token);
    }

    static void testGetDetails() throws IOException {
        TokenResource r = new TokenResource();
        DetailsResponse response = r.getApi().details("com.tencent.mm");
        System.out.println(response);
    }
}
