package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class MJ0 implements RJ0 {
    @Override // com.google.android.gms.internal.ads.RJ0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
