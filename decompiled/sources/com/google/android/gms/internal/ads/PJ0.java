package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class PJ0 implements RJ0 {
    @Override // com.google.android.gms.internal.ads.RJ0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
