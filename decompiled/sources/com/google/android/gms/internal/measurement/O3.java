package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class O3 extends Exception {
    public O3(String str) {
        super(str);
    }

    public O3(String str, Throwable th) {
        super("ContentProvider query failed", th);
    }
}
