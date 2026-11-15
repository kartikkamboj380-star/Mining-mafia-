package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6249k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Uri f36734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f36735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f36736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f36737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f36738e;

    private C6249k4(String str, Uri uri, String str2, String str3, boolean z9, boolean z10, boolean z11, boolean z12, X5.c cVar) {
        this.f36734a = uri;
        this.f36735b = "";
        this.f36736c = "";
        this.f36737d = z9;
        this.f36738e = z11;
    }

    public final C6249k4 a() {
        String str = this.f36735b;
        if (str.isEmpty()) {
            return new C6249k4(null, this.f36734a, str, this.f36736c, true, false, this.f36738e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C6249k4 b() {
        return new C6249k4(null, this.f36734a, this.f36735b, this.f36736c, this.f36737d, false, true, false, null);
    }

    public final AbstractC6303q4 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = AbstractC6303q4.f36860j;
        return new C6213g4(this, str, lValueOf, true);
    }

    public final AbstractC6303q4 d(String str, boolean z9) {
        Boolean boolValueOf = Boolean.valueOf(z9);
        int i10 = AbstractC6303q4.f36860j;
        return new C6222h4(this, str, boolValueOf, true);
    }

    public final AbstractC6303q4 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = AbstractC6303q4.f36860j;
        return new C6231i4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC6303q4 f(String str, String str2) {
        int i10 = AbstractC6303q4.f36860j;
        return new C6240j4(this, str, str2, true);
    }

    public C6249k4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
