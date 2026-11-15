package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3598gM0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28629a;

    public C3598gM0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f28629a = true;
    }

    final boolean b() {
        return this.f28629a;
    }

    public C3598gM0(String str) {
        super(str);
    }

    public C3598gM0(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
