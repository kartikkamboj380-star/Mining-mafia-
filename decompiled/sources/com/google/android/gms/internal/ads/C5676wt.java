package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5676wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f34658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1796Gt f34659b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34663f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f34661d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f34664g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34665h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f34666i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f34667j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f34668k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedList f34660c = new LinkedList();

    C5676wt(Clock clock, C1796Gt c1796Gt, String str, String str2) {
        this.f34658a = clock;
        this.f34659b = c1796Gt;
        this.f34662e = str;
        this.f34663f = str2;
    }

    public final void a(H4.h2 h2Var) {
        synchronized (this.f34661d) {
            long jElapsedRealtime = this.f34658a.elapsedRealtime();
            this.f34667j = jElapsedRealtime;
            this.f34659b.e(h2Var, jElapsedRealtime);
        }
    }

    public final void b() {
        synchronized (this.f34661d) {
            this.f34659b.f();
        }
    }

    public final void c() {
        synchronized (this.f34661d) {
            this.f34659b.g();
        }
    }

    public final void d(long j10) {
        synchronized (this.f34661d) {
            try {
                this.f34668k = j10;
                if (j10 != -1) {
                    this.f34659b.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f34661d) {
            try {
                if (this.f34668k != -1 && this.f34664g == -1) {
                    this.f34664g = this.f34658a.elapsedRealtime();
                    this.f34659b.a(this);
                }
                this.f34659b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f34661d) {
            try {
                if (this.f34668k != -1) {
                    C5550vt c5550vt = new C5550vt(this);
                    c5550vt.c();
                    this.f34660c.add(c5550vt);
                    this.f34666i++;
                    C1796Gt c1796Gt = this.f34659b;
                    c1796Gt.c();
                    c1796Gt.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f34661d) {
            try {
                if (this.f34668k != -1) {
                    LinkedList linkedList = this.f34660c;
                    if (!linkedList.isEmpty()) {
                        C5550vt c5550vt = (C5550vt) linkedList.getLast();
                        if (c5550vt.a() == -1) {
                            c5550vt.b();
                            this.f34659b.a(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(boolean z9) {
        synchronized (this.f34661d) {
            try {
                if (this.f34668k != -1) {
                    this.f34665h = this.f34658a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle i() {
        Bundle bundle;
        synchronized (this.f34661d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f34662e);
                bundle.putString("slotid", this.f34663f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f34667j);
                bundle.putLong("tresponse", this.f34668k);
                bundle.putLong("timp", this.f34664g);
                bundle.putLong("tload", this.f34665h);
                bundle.putLong("pcc", this.f34666i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f34660c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5550vt) it.next()).d());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String j() {
        return this.f34662e;
    }

    final /* synthetic */ Clock k() {
        return this.f34658a;
    }
}
