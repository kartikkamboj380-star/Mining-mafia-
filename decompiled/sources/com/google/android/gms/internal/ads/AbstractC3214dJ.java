package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3214dJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map f27401a = new HashMap();

    protected AbstractC3214dJ(Set set) {
        e1(set);
    }

    public final synchronized void a1(C3593gK c3593gK) {
        b1(c3593gK.f28619a, c3593gK.f28620b);
    }

    public final synchronized void b1(Object obj, Executor executor) {
        this.f27401a.put(obj, executor);
    }

    public final synchronized void e1(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a1((C3593gK) it.next());
        }
    }

    protected final synchronized void g1(final InterfaceC3088cJ interfaceC3088cJ) {
        for (Map.Entry entry : this.f27401a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bJ
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    try {
                        interfaceC3088cJ.zza(key);
                    } catch (Throwable th) {
                        G4.t.l().k(th, "EventEmitter.notify");
                        AbstractC0786o0.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
