package com.google.android.gms.internal.measurement;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6278n6 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(K4.f36323b),
    ENUM(null),
    MESSAGE(null);

    EnumC6278n6(Object obj) {
    }
}
