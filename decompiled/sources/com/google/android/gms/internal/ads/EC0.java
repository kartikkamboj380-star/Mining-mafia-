package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class EC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f18434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f18435b;

    static {
        int[] iArr = new int[EnumC2832aG0.values().length];
        f18435b = iArr;
        try {
            iArr[EnumC2832aG0.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18435b[EnumC2832aG0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[EnumC5725xG0.values().length];
        f18434a = iArr2;
        try {
            iArr2[EnumC5725xG0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18434a[EnumC5725xG0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18434a[EnumC5725xG0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18434a[EnumC5725xG0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
