package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class L01 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ L01 f20330a = new L01();

    private /* synthetic */ L01() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((V01) ((List) obj).get(0)).compareTo((V01) ((List) obj2).get(0));
    }
}
