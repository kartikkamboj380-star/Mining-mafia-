package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5706x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34744e;

    public C5706x7(int i10, int i11, int i12) {
        String string;
        if (i10 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 1);
            sb.append(i10);
            sb.append("/");
            string = sb.toString();
        } else {
            string = "";
        }
        this.f34740a = string;
        this.f34741b = i11;
        this.f34742c = i12;
        this.f34743d = LinearLayoutManager.INVALID_OFFSET;
        this.f34744e = "";
    }

    private final void d() {
        if (this.f34743d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void a() {
        int i10 = this.f34743d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f34741b : i10 + this.f34742c;
        this.f34743d = i11;
        String str = this.f34740a;
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(i11).length());
        sb.append(str);
        sb.append(i11);
        this.f34744e = sb.toString();
    }

    public final int b() {
        d();
        return this.f34743d;
    }

    public final String c() {
        d();
        return this.f34744e;
    }
}
