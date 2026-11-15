package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
final class L8 implements InterfaceC5834y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20387a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4197l8 f20388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BlockingQueue f20389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4827q8 f20390d;

    L8(C4197l8 c4197l8, BlockingQueue blockingQueue, C4827q8 c4827q8) {
        this.f20390d = c4827q8;
        this.f20388b = c4197l8;
        this.f20389c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5834y8
    public final synchronized void a(AbstractC5960z8 abstractC5960z8) {
        try {
            Map map = this.f20387a;
            String strJ = abstractC5960z8.j();
            List list = (List) map.remove(strJ);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (K8.f20109b) {
                K8.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strJ);
            }
            AbstractC5960z8 abstractC5960z9 = (AbstractC5960z8) list.remove(0);
            map.put(strJ, list);
            abstractC5960z9.v(this);
            try {
                this.f20389c.put(abstractC5960z9);
            } catch (InterruptedException e10) {
                K8.c("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                this.f20388b.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5834y8
    public final void b(AbstractC5960z8 abstractC5960z8, E8 e10) {
        List list;
        C3821i8 c3821i8 = e10.f18422b;
        if (c3821i8 == null || c3821i8.a(System.currentTimeMillis())) {
            a(abstractC5960z8);
            return;
        }
        String strJ = abstractC5960z8.j();
        synchronized (this) {
            list = (List) this.f20387a.remove(strJ);
        }
        if (list != null) {
            if (K8.f20109b) {
                K8.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strJ);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f20390d.a((AbstractC5960z8) it.next(), e10, null);
            }
        }
    }

    final synchronized boolean c(AbstractC5960z8 abstractC5960z8) {
        try {
            Map map = this.f20387a;
            String strJ = abstractC5960z8.j();
            if (!map.containsKey(strJ)) {
                map.put(strJ, null);
                abstractC5960z8.v(this);
                if (K8.f20109b) {
                    K8.b("new request, sending to network %s", strJ);
                }
                return false;
            }
            List arrayList = (List) map.get(strJ);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            abstractC5960z8.d("waiting-for-response");
            arrayList.add(abstractC5960z8);
            map.put(strJ, arrayList);
            if (K8.f20109b) {
                K8.b("Request for cacheKey=%s is in flight, putting on hold.", strJ);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
