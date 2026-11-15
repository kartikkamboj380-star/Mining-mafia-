package com.reactnativegooglesignin;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42209b;

    public a(Exception e10, String str) {
        String statusCodeString;
        Intrinsics.checkNotNullParameter(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        localizedMessage = localizedMessage == null ? e10.getMessage() : localizedMessage;
        if (!(e10 instanceof ApiException)) {
            if (!(e10 instanceof UnsupportedApiCallException)) {
                this.f42208a = str;
                this.f42209b = localizedMessage;
                return;
            }
            this.f42208a = str;
            this.f42209b = localizedMessage + " Make sure you have the latest version of Google Play Services installed.";
            return;
        }
        ApiException apiException = (ApiException) e10;
        int statusCode = apiException.getStatusCode();
        if (localizedMessage == null || localizedMessage.length() <= 10 || localizedMessage == null) {
            statusCodeString = p006a5.c.getStatusCodeString(statusCode);
            Intrinsics.checkNotNullExpressionValue(statusCodeString, "getStatusCodeString(...)");
        } else {
            statusCodeString = new Regex(statusCode + ": ").c(localizedMessage, "");
        }
        this.f42208a = String.valueOf((statusCode == 12501 || apiException.getStatus().isCanceled()) ? 12501 : statusCode);
        this.f42209b = statusCodeString;
    }

    public final String a() {
        return this.f42208a;
    }

    public final String b() {
        return this.f42209b;
    }
}
