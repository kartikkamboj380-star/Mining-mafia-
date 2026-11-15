package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4454nA0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31729h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f31730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f31732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f31733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31736g;

    static {
        R4.b("media3.datasource");
    }

    /* synthetic */ C4454nA0(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j11, j12, null, i11, null);
    }

    public final boolean a(int i10) {
        return (this.f31736g & i10) == i10;
    }

    public final C2172Nz0 b() {
        return new C2172Nz0(this, null);
    }

    public final String toString() {
        String string = this.f31730a.toString();
        int length = string.length();
        long j10 = this.f31734e;
        int length2 = String.valueOf(j10).length();
        long j11 = this.f31735f;
        int length3 = String.valueOf(j11).length();
        int i10 = this.f31736g;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i10).length() + 1);
        sb.append("DataSpec[");
        sb.append("GET");
        sb.append(" ");
        sb.append(string);
        sb.append(", ");
        sb.append(j10);
        sb.append(", ");
        sb.append(j11);
        sb.append(", null, ");
        sb.append(i10);
        sb.append("]");
        return sb.toString();
    }

    private C4454nA0(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        boolean z9 = false;
        boolean z10 = j11 >= 0;
        AbstractC2418Ss0.a(z10);
        AbstractC2418Ss0.a(z10);
        if (j12 > 0) {
            z9 = true;
        } else if (j12 == -1) {
            j12 = -1;
            z9 = true;
        }
        AbstractC2418Ss0.a(z9);
        uri.getClass();
        this.f31730a = uri;
        this.f31731b = 1;
        this.f31732c = null;
        this.f31733d = Collections.unmodifiableMap(new HashMap(map));
        this.f31734e = j11;
        this.f31735f = j12;
        this.f31736g = i11;
    }

    public C4454nA0(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }
}
