package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3118cY {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27143a;

    EnumC3118cY(String str) {
        this.f27143a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27143a;
    }
}
