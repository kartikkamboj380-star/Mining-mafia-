package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class OK0 extends AbstractC5859yK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final OK0 f21507a = new OK0();

    private OK0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5859yK0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ZK0 zk0, AbstractC4977rK0 abstractC4977rK0) throws IOException {
        if (abstractC4977rK0 == null || (abstractC4977rK0 instanceof C5103sK0)) {
            zk0.J();
            return;
        }
        if (abstractC4977rK0 instanceof C5481vK0) {
            C5481vK0 c5481vK0E = abstractC4977rK0.e();
            if (c5481vK0E.zzc()) {
                zk0.G(c5481vK0E.i());
                return;
            } else if (c5481vK0E.zza()) {
                zk0.x(c5481vK0E.g());
                return;
            } else {
                zk0.w(c5481vK0E.a());
                return;
            }
        }
        if (abstractC4977rK0 instanceof C4852qK0) {
            zk0.c();
            Iterator it = abstractC4977rK0.d().iterator();
            while (it.hasNext()) {
                a(zk0, (AbstractC4977rK0) it.next());
            }
            zk0.h();
            return;
        }
        if (!(abstractC4977rK0 instanceof C5229tK0)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(abstractC4977rK0.getClass())));
        }
        zk0.j();
        for (Map.Entry entry : abstractC4977rK0.b().i()) {
            zk0.v((String) entry.getKey());
            a(zk0, (AbstractC4977rK0) entry.getValue());
        }
        zk0.n();
    }
}
