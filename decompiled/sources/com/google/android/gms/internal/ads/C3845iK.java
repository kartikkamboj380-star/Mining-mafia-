package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3845iK extends AbstractC3214dJ implements InterfaceC5520ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f29327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f29328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3502fb0 f29329d;

    public C3845iK(Context context, Set set, C3502fb0 c3502fb0) {
        super(set);
        this.f29327b = new WeakHashMap(1);
        this.f29328c = context;
        this.f29329d = c3502fb0;
    }

    public final synchronized void j1(View view) {
        try {
            Map map = this.f29327b;
            ViewOnAttachStateChangeListenerC5772xe viewOnAttachStateChangeListenerC5772xe = (ViewOnAttachStateChangeListenerC5772xe) map.get(view);
            if (viewOnAttachStateChangeListenerC5772xe == null) {
                ViewOnAttachStateChangeListenerC5772xe viewOnAttachStateChangeListenerC5772xe2 = new ViewOnAttachStateChangeListenerC5772xe(this.f29328c, view);
                viewOnAttachStateChangeListenerC5772xe2.a(this);
                map.put(view, viewOnAttachStateChangeListenerC5772xe2);
                viewOnAttachStateChangeListenerC5772xe = viewOnAttachStateChangeListenerC5772xe2;
            }
            if (this.f29329d.f28392X) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29711V1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC5772xe.d(((Long) H4.B.c().d(AbstractC3892ii.f29701U1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC5772xe.e();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k1(View view) {
        Map map = this.f29327b;
        if (map.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC5772xe) map.get(view)).b(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final synchronized void s0(final C5394ue c5394ue) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.hK
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC5520ve) obj).s0(c5394ue);
            }
        });
    }
}
