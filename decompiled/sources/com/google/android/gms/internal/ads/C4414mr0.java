package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4414mr0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31581b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31580a = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f31581b, ((C4414mr0) obj).f31581b);
    }
}
