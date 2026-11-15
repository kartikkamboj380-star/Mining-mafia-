package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ku0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4168ku0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4168ku0 f30895a = new C3916iu0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC4168ku0 f30896b = new C4042ju0(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC4168ku0 f30897c = new C4042ju0(1);

    /* synthetic */ AbstractC4168ku0(byte[] bArr) {
    }

    public static AbstractC4168ku0 f() {
        return f30895a;
    }

    public abstract AbstractC4168ku0 a(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC4168ku0 b(int i10, int i11);

    public abstract AbstractC4168ku0 c(boolean z9, boolean z10);

    public abstract AbstractC4168ku0 d(boolean z9, boolean z10);

    public abstract int e();
}
