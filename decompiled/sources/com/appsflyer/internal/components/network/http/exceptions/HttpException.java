package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1dSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1dSDK getRevenue;

    public HttpException(@NonNull Throwable th, @NonNull AFd1dSDK aFd1dSDK) {
        super(th.getMessage(), th);
        this.getRevenue = aFd1dSDK;
    }

    @NonNull
    public AFd1dSDK getMetrics() {
        return this.getRevenue;
    }
}
