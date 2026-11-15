package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class B8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f17503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f17504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f17505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f17506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3945j8 f17507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5078s8 f17508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5204t8[] f17509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4197l8 f17510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f17511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f17512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C4827q8 f17513k;

    public B8(InterfaceC3945j8 interfaceC3945j8, InterfaceC5078s8 interfaceC5078s8, int i10) {
        C4827q8 c4827q8 = new C4827q8(new Handler(Looper.getMainLooper()));
        this.f17503a = new AtomicInteger();
        this.f17504b = new HashSet();
        this.f17505c = new PriorityBlockingQueue();
        this.f17506d = new PriorityBlockingQueue();
        this.f17511i = new ArrayList();
        this.f17512j = new ArrayList();
        this.f17507e = interfaceC3945j8;
        this.f17508f = interfaceC5078s8;
        this.f17509g = new C5204t8[4];
        this.f17513k = c4827q8;
    }

    public final void a() {
        C4197l8 c4197l8 = this.f17510h;
        if (c4197l8 != null) {
            c4197l8.a();
        }
        C5204t8[] c5204t8Arr = this.f17509g;
        for (int i10 = 0; i10 < 4; i10++) {
            C5204t8 c5204t8 = c5204t8Arr[i10];
            if (c5204t8 != null) {
                c5204t8.a();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.f17505c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.f17506d;
        InterfaceC3945j8 interfaceC3945j8 = this.f17507e;
        C4827q8 c4827q8 = this.f17513k;
        C4197l8 c4197l9 = new C4197l8(priorityBlockingQueue, priorityBlockingQueue2, interfaceC3945j8, c4827q8);
        this.f17510h = c4197l9;
        c4197l9.start();
        for (int i11 = 0; i11 < 4; i11++) {
            C5204t8 c5204t9 = new C5204t8(priorityBlockingQueue2, this.f17508f, interfaceC3945j8, c4827q8);
            c5204t8Arr[i11] = c5204t9;
            c5204t9.start();
        }
    }

    public final AbstractC5960z8 b(AbstractC5960z8 abstractC5960z8) {
        abstractC5960z8.g(this);
        Set set = this.f17504b;
        synchronized (set) {
            set.add(abstractC5960z8);
        }
        abstractC5960z8.h(this.f17503a.incrementAndGet());
        abstractC5960z8.d("add-to-queue");
        d(abstractC5960z8, 0);
        this.f17505c.add(abstractC5960z8);
        return abstractC5960z8;
    }

    final void c(AbstractC5960z8 abstractC5960z8) {
        Set set = this.f17504b;
        synchronized (set) {
            set.remove(abstractC5960z8);
        }
        List list = this.f17511i;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                p070h.w.a(it.next());
                throw null;
            }
        }
        d(abstractC5960z8, 5);
    }

    final void d(AbstractC5960z8 abstractC5960z8, int i10) {
        List list = this.f17512j;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    p070h.w.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
