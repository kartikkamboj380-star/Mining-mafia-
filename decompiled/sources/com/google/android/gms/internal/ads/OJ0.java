package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class OJ0 implements RJ0 {
    @Override // com.google.android.gms.internal.ads.RJ0
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
