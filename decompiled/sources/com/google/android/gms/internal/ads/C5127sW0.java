package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5127sW0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JY0 f33179c;

    public C5127sW0(int i10, JY0 jy0, boolean z9) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i10);
        super(sb.toString());
        this.f33178b = z9;
        this.f33177a = i10;
        this.f33179c = jy0;
    }
}
