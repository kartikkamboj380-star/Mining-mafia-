package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1796Gt implements InterfaceC2233Pe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0790q0 f19151b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final C1692Et f19153d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19150a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final HashSet f19154e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final HashSet f19155f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19156g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1744Ft f19152c = new C1744Ft();

    public C1796Gt(String str, InterfaceC0790q0 interfaceC0790q0) {
        this.f19153d = new C1692Et(str, interfaceC0790q0);
        this.f19151b = interfaceC0790q0;
    }

    public final void a(C5676wt c5676wt) {
        synchronized (this.f19150a) {
            this.f19154e.add(c5676wt);
        }
    }

    public final void b(HashSet hashSet) {
        synchronized (this.f19150a) {
            this.f19154e.addAll(hashSet);
        }
    }

    public final void c() {
        synchronized (this.f19150a) {
            this.f19153d.a();
        }
    }

    public final void d() {
        synchronized (this.f19150a) {
            this.f19153d.b();
        }
    }

    public final void e(H4.h2 h2Var, long j10) {
        synchronized (this.f19150a) {
            this.f19153d.e(h2Var, j10);
        }
    }

    public final void f() {
        synchronized (this.f19150a) {
            this.f19153d.f();
        }
    }

    public final void g() {
        synchronized (this.f19150a) {
            this.f19153d.g();
        }
    }

    public final void h() {
        synchronized (this.f19150a) {
            this.f19153d.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2233Pe
    public final void h0(boolean z9) {
        long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
        if (!z9) {
            InterfaceC0790q0 interfaceC0790q0 = this.f19151b;
            interfaceC0790q0.C0(jCurrentTimeMillis);
            interfaceC0790q0.N0(this.f19153d.f18583d);
            return;
        }
        InterfaceC0790q0 interfaceC0790q1 = this.f19151b;
        if (jCurrentTimeMillis - interfaceC0790q1.e() > ((Long) H4.B.c().d(AbstractC3892ii.f29511B1)).longValue()) {
            this.f19153d.f18583d = -1;
        } else {
            this.f19153d.f18583d = interfaceC0790q1.zzo();
        }
        this.f19156g = true;
    }

    public final int i() {
        int iD;
        synchronized (this.f19150a) {
            iD = this.f19153d.d();
        }
        return iD;
    }

    public final C5676wt j(Clock clock, String str) {
        return new C5676wt(clock, this, this.f19152c.a(), str);
    }

    public final boolean k() {
        return this.f19156g;
    }

    public final String l() {
        return this.f19152c.b();
    }

    public final C1640Dt m(Set set, String str) {
        return this.f19153d.i(set, str);
    }

    public final Bundle n(Context context, C3882ic0 c3882ic0) {
        HashSet hashSet = new HashSet();
        synchronized (this.f19150a) {
            HashSet hashSet2 = this.f19154e;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f19153d.h(context, this.f19152c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f19155f.iterator();
        if (it.hasNext()) {
            p070h.w.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C5676wt) it2.next()).i());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c3882ic0.a(hashSet);
        return bundle;
    }
}
