package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2285Qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22414a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2181Oe f22415b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22416c = false;

    public final void a(Context context) {
        synchronized (this.f22414a) {
            try {
                if (!this.f22416c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.f("Can not cast Context to Application");
                    } else {
                        if (this.f22415b == null) {
                            this.f22415b = new C2181Oe();
                        }
                        this.f22415b.a(application, context);
                        this.f22416c = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC2233Pe interfaceC2233Pe) {
        synchronized (this.f22414a) {
            try {
                if (this.f22415b == null) {
                    this.f22415b = new C2181Oe();
                }
                this.f22415b.b(interfaceC2233Pe);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC2233Pe interfaceC2233Pe) {
        synchronized (this.f22414a) {
            try {
                C2181Oe c2181Oe = this.f22415b;
                if (c2181Oe == null) {
                    return;
                }
                c2181Oe.c(interfaceC2233Pe);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity d() {
        synchronized (this.f22414a) {
            try {
                C2181Oe c2181Oe = this.f22415b;
                if (c2181Oe == null) {
                    return null;
                }
                return c2181Oe.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context e() {
        synchronized (this.f22414a) {
            try {
                C2181Oe c2181Oe = this.f22415b;
                if (c2181Oe == null) {
                    return null;
                }
                return c2181Oe.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        synchronized (this.f22414a) {
            try {
                C2181Oe c2181Oe = this.f22415b;
                if (c2181Oe == null) {
                    return false;
                }
                return c2181Oe.g().get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(C5492vQ c5492vQ) {
        synchronized (this.f22414a) {
            try {
                if (this.f22415b == null) {
                    this.f22415b = new C2181Oe();
                }
                this.f22415b.j(c5492vQ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
