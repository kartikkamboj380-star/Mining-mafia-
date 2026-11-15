package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ai0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1463Ai0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f17391h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1515Bi0 f17393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1721Fh0 f17394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1461Ah0 f17395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4648oi0 f17397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f17398g = new Object();

    public C1463Ai0(Context context, InterfaceC1515Bi0 interfaceC1515Bi0, C1721Fh0 c1721Fh0, C1461Ah0 c1461Ah0, boolean z9) {
        this.f17392a = context;
        this.f17393b = interfaceC1515Bi0;
        this.f17394c = c1721Fh0;
        this.f17395d = c1461Ah0;
        this.f17396e = z9;
    }

    private final synchronized Class d(C4774pi0 c4774pi0) {
        try {
            if (c4774pi0.a() == null) {
                throw new C5907yi0(4010, "mc");
            }
            String strD0 = c4774pi0.a().d0();
            HashMap map = f17391h;
            Class cls = (Class) map.get(strD0);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f17395d.a(c4774pi0.b())) {
                    throw new C5907yi0(2026, "VM did not pass signature verification");
                }
                try {
                    File fileC = c4774pi0.c();
                    if (!fileC.exists()) {
                        fileC.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(c4774pi0.b().getAbsolutePath(), fileC.getAbsolutePath(), null, this.f17392a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strD0, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new C5907yi0(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new C5907yi0(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new C5907yi0(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new C5907yi0(2026, e13);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean a(C4774pi0 c4774pi0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C4648oi0 c4648oi0 = new C4648oi0(d(c4774pi0).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f17392a, "msa-r", c4774pi0.d(), null, new Bundle(), 2), c4774pi0, this.f17393b, this.f17394c, this.f17396e);
                if (!c4648oi0.f()) {
                    throw new C5907yi0(4000, "init failed");
                }
                int iH = c4648oi0.h();
                if (iH != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iH).length() + 4);
                    sb.append("ci: ");
                    sb.append(iH);
                    throw new C5907yi0(4001, sb.toString());
                }
                synchronized (this.f17398g) {
                    C4648oi0 c4648oi1 = this.f17397f;
                    if (c4648oi1 != null) {
                        try {
                            c4648oi1.g();
                        } catch (C5907yi0 e10) {
                            this.f17394c.c(e10.a(), -1L, e10);
                        }
                        this.f17397f = c4648oi0;
                    } else {
                        this.f17397f = c4648oi0;
                    }
                    throw th;
                }
                this.f17394c.b(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new C5907yi0(2004, e11);
            }
        } catch (C5907yi0 e12) {
            this.f17394c.c(e12.a(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.f17394c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    public final InterfaceC1877Ih0 b() {
        C4648oi0 c4648oi0;
        synchronized (this.f17398g) {
            c4648oi0 = this.f17397f;
        }
        return c4648oi0;
    }

    public final C4774pi0 c() {
        synchronized (this.f17398g) {
            try {
                C4648oi0 c4648oi0 = this.f17397f;
                if (c4648oi0 == null) {
                    return null;
                }
                return c4648oi0.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
