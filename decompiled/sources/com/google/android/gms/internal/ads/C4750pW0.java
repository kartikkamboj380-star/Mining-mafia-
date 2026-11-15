package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4750pW0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32409a;

    public C4750pW0(int i10, int i11, int i12, int i13, int i14, JY0 jy0, boolean z9, Exception exc) {
        String strValueOf = String.valueOf(jy0);
        int length = String.valueOf(i11).length();
        int length2 = String.valueOf(i12).length();
        int length3 = String.valueOf(i13).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i14).length() + 2 + strValueOf.length());
        sb.append("AudioTrack init failed 0 Config(");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(i13);
        sb.append(", ");
        sb.append(i14);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append("");
        super(sb.toString(), exc);
        this.f32409a = false;
    }
}
