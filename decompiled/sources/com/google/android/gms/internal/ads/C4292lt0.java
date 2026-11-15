package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4292lt0 implements Serializable, InterfaceC4166kt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C5173st0 f31381a = new C5173st0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC4166kt0 f31382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile transient boolean f31383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object f31384d;

    C4292lt0(InterfaceC4166kt0 interfaceC4166kt0) {
        this.f31382b = interfaceC4166kt0;
    }

    public final String toString() {
        Object string;
        if (this.f31383c) {
            String strValueOf = String.valueOf(this.f31384d);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f31382b;
        }
        String string2 = string.toString();
        StringBuilder sb2 = new StringBuilder(string2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
    public final Object zza() {
        if (!this.f31383c) {
            synchronized (this.f31381a) {
                try {
                    if (!this.f31383c) {
                        Object objZza = this.f31382b.zza();
                        this.f31384d = objZza;
                        this.f31383c = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f31384d;
    }
}
