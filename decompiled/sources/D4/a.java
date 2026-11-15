package D4;

import B4.e;
import B4.j;
import B4.o;
import B4.u;
import H4.B;
import L4.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.C2205Oq;
import com.google.android.gms.internal.ads.C6026zf;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: D4.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0017a extends e {
    }

    public static void b(final Context context, final String str, final AdRequest adRequest, final AbstractC0017a abstractC0017a) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC3892ii.a(context);
        if (((Boolean) AbstractC3894ij.f30047d.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                c.f3105b.execute(new Runnable() { // from class: D4.b
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        a.AbstractC0017a abstractC0017a2 = abstractC0017a;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new C6026zf(context2, str, adRequest2.a(), abstractC0017a2).a();
                        } catch (IllegalStateException e10) {
                            C2205Oq.c(context2).b(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C6026zf(context, str, adRequest.a(), abstractC0017a).a();
    }

    public abstract u a();

    public abstract void c(j jVar);

    public abstract void d(boolean z9);

    public abstract void e(o oVar);

    public abstract void f(Activity activity);
}
