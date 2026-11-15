package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4392mg0 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31568a;

    EnumC4392mg0(String str) {
        this.f31568a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f31568a;
    }
}
