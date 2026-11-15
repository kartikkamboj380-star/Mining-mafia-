package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C2444Tf0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C2444Tf0 f23591a = new C2444Tf0();

    private /* synthetic */ C2444Tf0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C2029Lf0 c2029Lf0 = (C2029Lf0) obj2;
        C2029Lf0 c2029Lf1 = (C2029Lf0) obj;
        int iCompare = Double.compare(c2029Lf0.e(), c2029Lf1.e());
        return iCompare == 0 ? Long.compare(c2029Lf1.d(), c2029Lf0.d()) : iCompare;
    }
}
