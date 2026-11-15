package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6473w1 extends RuntimeException {
    public C6473w1(V0 v10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final A0 a() {
        return new A0(getMessage());
    }
}
