package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: loaded from: classes2.dex */
public abstract class YB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f25561a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = f25561a;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
