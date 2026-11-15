package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3823i9 extends RP0 implements Closeable {
    static {
        YP0.b(C3823i9.class);
    }

    public C3823i9(SP0 sp0, InterfaceC3697h9 interfaceC3697h9) {
        h(sp0, sp0.zzb(), interfaceC3697h9);
    }

    @Override // com.google.android.gms.internal.ads.RP0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.RP0
    public final String toString() {
        String string = this.f22801b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
