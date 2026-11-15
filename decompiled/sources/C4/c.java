package C4;

import H4.B;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.C2205Oq;
import com.google.android.gms.internal.ads.C3148cn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends M4.a {
    public static void g(final Context context, final String str, final a aVar, final d dVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(aVar, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(dVar, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC3892ii.a(context);
        if (((Boolean) AbstractC3894ij.f30052i.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                L4.c.f3105b.execute(new Runnable() { // from class: C4.g
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        d dVar2 = dVar;
                        a aVar2 = aVar;
                        Context context2 = context;
                        try {
                            new C3148cn(context2, str).i(aVar2.a(), dVar2);
                        } catch (IllegalStateException e10) {
                            C2205Oq.c(context2).b(e10, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C3148cn(context, str).i(aVar.a(), dVar);
    }

    public abstract void h(e eVar);
}
