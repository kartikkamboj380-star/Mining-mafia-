package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class FJ0 implements IJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RJ0 f18730a;

    @Override // com.google.android.gms.internal.ads.IJ0
    public final Object k(String str) {
        Iterator it = JJ0.a("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f18730a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f18730a.a(str, null);
    }
}
