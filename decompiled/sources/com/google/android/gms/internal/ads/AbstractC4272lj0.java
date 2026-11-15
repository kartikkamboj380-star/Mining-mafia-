package com.google.android.gms.internal.ads;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4272lj0 {
    public static Object a(String str, String str2, AbstractC4146kj0... abstractC4146kj0Arr) {
        return Class.forName(str).getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
    }
}
