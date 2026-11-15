package U4;

import B4.j;
import B4.o;
import B4.u;
import H4.B;
import L4.p;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.C2205Oq;
import com.google.android.gms.internal.ads.C4289ls;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static void c(final Context context, final String str, final C4.a aVar, final d dVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(aVar, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(dVar, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC3892ii.a(context);
        if (((Boolean) AbstractC3894ij.f30054k.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                p.a("Loading on background thread");
                L4.c.f3105b.execute(new Runnable() { // from class: U4.g
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        d dVar2 = dVar;
                        C4.a aVar2 = aVar;
                        Context context2 = context;
                        try {
                            new C4289ls(context2, str).j(aVar2.a(), dVar2);
                        } catch (IllegalStateException e10) {
                            C2205Oq.c(context2).b(e10, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        p.a("Loading on UI thread");
        new C4289ls(context, str).j(aVar.a(), dVar);
    }

    public static void d(final Context context, final String str, final AdRequest adRequest, final d dVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(dVar, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC3892ii.a(context);
        if (((Boolean) AbstractC3894ij.f30054k.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                L4.c.f3105b.execute(new Runnable() { // from class: U4.h
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        d dVar2 = dVar;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new C4289ls(context2, str).j(adRequest2.a(), dVar2);
                        } catch (IllegalStateException e10) {
                            C2205Oq.c(context2).b(e10, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        p.a("Loading on UI thread");
        new C4289ls(context, str).j(adRequest.a(), dVar);
    }

    public abstract u a();

    public abstract b b();

    public abstract void e(j jVar);

    public abstract void f(boolean z9);

    public abstract void g(o oVar);

    public abstract void h(e eVar);

    public abstract void i(Activity activity, B4.p pVar);
}
