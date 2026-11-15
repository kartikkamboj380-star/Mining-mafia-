package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class JJ0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JJ0 f19825b = new JJ0(new KJ0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JJ0 f19826c = new JJ0(new OJ0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JJ0 f19827d = new JJ0(new QJ0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JJ0 f19828e = new JJ0(new PJ0());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final JJ0 f19829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final JJ0 f19830g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IJ0 f19831a;

    static {
        new JJ0(new LJ0());
        f19829f = new JJ0(new NJ0());
        f19830g = new JJ0(new MJ0());
    }

    public JJ0(RJ0 rj0) {
        this.f19831a = !VB0.a() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new FJ0(rj0, null) : new GJ0(rj0, null) : new HJ0(rj0, null);
    }

    public static List a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object b(String str) {
        return this.f19831a.k(str);
    }
}
