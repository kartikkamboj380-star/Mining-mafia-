package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class R8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f22727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f22728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f22729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f22730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f22731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f22732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f22733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final List f22734h;

    private R8(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f22728b = str;
        this.f22729c = true == "".equals(str2) ? null : str2;
        this.f22730d = j10;
        this.f22731e = j11;
        this.f22732f = j12;
        this.f22733g = j13;
        this.f22734h = list;
    }

    static R8 a(S8 s10) throws IOException {
        if (U8.g(s10) != 538247942) {
            throw new IOException();
        }
        String strL = U8.l(s10);
        String strL2 = U8.l(s10);
        long jI = U8.i(s10);
        long jI2 = U8.i(s10);
        long jI3 = U8.i(s10);
        long jI4 = U8.i(s10);
        int iG = U8.g(s10);
        if (iG < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(iG).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(iG);
            throw new IOException(sb.toString());
        }
        List arrayList = iG == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iG; i10++) {
            arrayList.add(new C4952r8(U8.l(s10).intern(), U8.l(s10).intern()));
        }
        return new R8(strL, strL2, jI, jI2, jI3, jI4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    R8(String str, C3821i8 c3821i8) {
        String str2 = c3821i8.f29281b;
        long j10 = c3821i8.f29282c;
        long j11 = c3821i8.f29283d;
        long j12 = c3821i8.f29284e;
        long j13 = c3821i8.f29285f;
        List arrayList = c3821i8.f29287h;
        if (arrayList == null) {
            Map map = c3821i8.f29286g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new C4952r8((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
