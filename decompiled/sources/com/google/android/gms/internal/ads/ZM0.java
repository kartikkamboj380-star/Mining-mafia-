package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class ZM0 extends RuntimeException {
    public ZM0(InterfaceC5863yM0 interfaceC5863yM0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C3598gM0 a() {
        return new C3598gM0(getMessage());
    }
}
