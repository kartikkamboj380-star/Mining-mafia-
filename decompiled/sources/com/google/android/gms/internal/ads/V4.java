package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class V4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5444v2 f24188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24190e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public V4(boolean z9, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        byte b10 = 0;
        int i13 = 1;
        AbstractC2418Ss0.a((i10 == 0) ^ (bArr2 == null));
        this.f24186a = z9;
        this.f24187b = str;
        this.f24189d = i10;
        this.f24190e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b10 = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0 && b10 != 1) {
                if (b10 == 2 || b10 == 3) {
                    i13 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    YU.c("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.f24188c = new C5444v2(i13, bArr, i11, i12);
    }
}
