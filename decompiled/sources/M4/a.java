package M4;

import B4.j;
import B4.o;
import B4.u;
import H4.B;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.C2205Oq;
import com.google.android.gms.internal.ads.C3148cn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static void b(final Context context, final String str, final AdRequest adRequest, final b bVar) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(bVar, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC3892ii.a(context);
        if (((Boolean) AbstractC3894ij.f30052i.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                L4.c.f3105b.execute(new Runnable() { // from class: M4.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        b bVar2 = bVar;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new C3148cn(context2, str).i(adRequest2.a(), bVar2);
                        } catch (IllegalStateException e10) {
                            C2205Oq.c(context2).b(e10, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C3148cn(context, str).i(adRequest.a(), bVar);
    }

    public abstract u a();

    public abstract void c(j jVar);

    public abstract void d(boolean z9);

    public abstract void e(o oVar);

    public abstract void f(Activity activity);
}
