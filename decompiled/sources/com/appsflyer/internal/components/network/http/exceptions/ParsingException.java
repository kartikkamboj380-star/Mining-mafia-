package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1ySDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1ySDK<String> getRevenue;

    public ParsingException(String str, Throwable th, @NonNull AFe1ySDK<String> aFe1ySDK) {
        super(str, th);
        this.getRevenue = aFe1ySDK;
    }

    @NonNull
    public AFe1ySDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
