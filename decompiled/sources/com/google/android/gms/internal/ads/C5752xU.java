package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5752xU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f34894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4739pR f34895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5118sS f34896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f34897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f34898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f34899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f34900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34902i;

    public C5752xU(Looper looper, InterfaceC3471fM interfaceC3471fM, InterfaceC5118sS interfaceC5118sS) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), interfaceC3471fM, interfaceC5118sS, true);
    }

    private final void i() {
        if (this.f34902i) {
            AbstractC2418Ss0.i(Thread.currentThread() == this.f34894a);
        }
    }

    public final C5752xU a(Looper looper, InterfaceC3471fM interfaceC3471fM, InterfaceC5118sS interfaceC5118sS) {
        return new C5752xU(this.f34897d, looper, looper.getThread(), interfaceC3471fM, interfaceC5118sS, this.f34902i);
    }

    public final void b(Object obj) {
        obj.getClass();
        synchronized (this.f34900g) {
            try {
                if (this.f34901h) {
                    return;
                }
                this.f34897d.add(new US(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        i();
        CopyOnWriteArraySet<US> copyOnWriteArraySet = this.f34897d;
        for (US us : copyOnWriteArraySet) {
            if (us.f24012a.equals(obj)) {
                us.c(this.f34896c);
                copyOnWriteArraySet.remove(us);
            }
        }
    }

    public final void d(final int i10, final RR rr) {
        i();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f34897d);
        this.f34899f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.vT
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    RR rr2 = rr;
                    ((US) it.next()).a(i10, rr2);
                }
            }
        });
    }

    public final void e() {
        i();
        ArrayDeque arrayDeque = this.f34899f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f34896c != null) {
            InterfaceC4739pR interfaceC4739pR = this.f34895b;
            interfaceC4739pR.getClass();
            if (!interfaceC4739pR.b(1)) {
                interfaceC4739pR.f(interfaceC4739pR.G(1));
            }
        }
        ArrayDeque arrayDeque2 = this.f34898e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void f() {
        i();
        synchronized (this.f34900g) {
            this.f34901h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f34897d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((US) it.next()).c(this.f34896c);
        }
        copyOnWriteArraySet.clear();
    }

    public final void g(boolean z9) {
        this.f34902i = false;
    }

    final /* synthetic */ boolean h(Message message) {
        InterfaceC5118sS interfaceC5118sS = this.f34896c;
        interfaceC5118sS.getClass();
        Iterator it = this.f34897d.iterator();
        while (it.hasNext()) {
            ((US) it.next()).b(interfaceC5118sS);
            InterfaceC4739pR interfaceC4739pR = this.f34895b;
            interfaceC4739pR.getClass();
            if (interfaceC4739pR.b(1)) {
                break;
            }
        }
        return true;
    }

    public C5752xU(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    private C5752xU(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, InterfaceC3471fM interfaceC3471fM, InterfaceC5118sS interfaceC5118sS, boolean z9) {
        this.f34894a = thread;
        this.f34897d = copyOnWriteArraySet;
        this.f34896c = interfaceC5118sS;
        this.f34900g = new Object();
        this.f34898e = new ArrayDeque();
        this.f34899f = new ArrayDeque();
        this.f34895b = (looper == null || interfaceC3471fM == null || interfaceC5118sS == null) ? null : interfaceC3471fM.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.WT
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                this.f24775a.h(message);
                return true;
            }
        });
        this.f34902i = z9;
    }
}
