package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6041zm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f35837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1731Fm0 f35838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f35839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1966Ka f35841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2718Ym0 f35842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5043rr0 f35843g;

    C6041zm0(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, C1731Fm0 c1731Fm0, InterfaceC2718Ym0 interfaceC2718Ym0, EnumC2894al0 enumC2894al0, String str, C1966Ka c1966Ka, InterfaceC5493vQ0 interfaceC5493vQ0, InterfaceC5493vQ0 interfaceC5493vQ1, InterfaceC5493vQ0 interfaceC5493vQ2, C5043rr0 c5043rr0) {
        this.f35837a = interfaceExecutorServiceC1805Gx0;
        this.f35838b = c1731Fm0;
        this.f35840d = str;
        this.f35842f = interfaceC2718Ym0;
        this.f35841e = c1966Ka;
        this.f35843g = c5043rr0;
        int iOrdinal = enumC2894al0.ordinal();
        if (iOrdinal == 0) {
            this.f35839c = ((C5241tQ0) interfaceC5493vQ0).zzb();
        } else if (iOrdinal == 1) {
            this.f35839c = ((C5241tQ0) interfaceC5493vQ1).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.f35839c = ((C5241tQ0) interfaceC5493vQ2).zzb();
        }
    }

    final com.google.common.util.concurrent.p a() {
        if (!this.f35838b.c()) {
            return AbstractC5685wx0.a(Integer.toString(7));
        }
        if (!this.f35842f.zzb()) {
            return AbstractC5685wx0.d(new Callable() { // from class: com.google.android.gms.internal.ads.ym0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f35440a.b();
                }
            }, this.f35837a);
        }
        Set set = this.f35839c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f35837a.e0((InterfaceCallableC1629Dn0) it.next()));
        }
        return AbstractC5685wx0.n(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.wm0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f34621a.c();
            }
        }, AbstractC2272Px0.a());
    }

    final /* synthetic */ String b() {
        return this.f35838b.g(16384, this.f35840d);
    }

    final /* synthetic */ String c() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.xm0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f35007a.d();
            }
        };
        C4792pr0 c4792pr0A = this.f35843g.a(101);
        try {
            c4792pr0A.a();
            Object objCall = callable.call();
            c4792pr0A.c();
            return (String) objCall;
        } catch (Throwable th) {
            try {
                c4792pr0A.b(th);
                throw th;
            } catch (Throwable th2) {
                c4792pr0A.c();
                throw th2;
            }
        }
    }

    final /* synthetic */ String d() {
        C4255lb c4255lb = (C4255lb) this.f35841e.w();
        String str = this.f35840d;
        C1731Fm0 c1731Fm0 = this.f35838b;
        try {
            return Base64.encodeToString(((C1552Cb) c1731Fm0.f(c4255lb.i(), str).w()).i(), 11);
        } catch (IllegalArgumentException unused) {
            return c1731Fm0.g(CodedOutputStream.DEFAULT_BUFFER_SIZE, str);
        }
    }
}
