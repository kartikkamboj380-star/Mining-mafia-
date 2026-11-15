package T4;

import H4.B;
import H4.B1;
import H4.C0612k1;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.C1894Iq;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B1 f5770a;

    public a(B1 b10) {
        this.f5770a = b10;
    }

    public static void a(Context context, B4.b bVar, AdRequest adRequest, b bVar2) {
        c(context, bVar, adRequest, null, bVar2);
    }

    private static void c(final Context context, final B4.b bVar, final AdRequest adRequest, final String str, final b bVar2) {
        AbstractC3892ii.a(context);
        if (((Boolean) AbstractC3894ij.f30053j.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                L4.c.f3105b.execute(new Runnable() { // from class: T4.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        C0612k1 c0612k1A = adRequest2 == null ? null : adRequest2.a();
                        new C1894Iq(context, bVar, c0612k1A, str).b(bVar2);
                    }
                });
                return;
            }
        }
        new C1894Iq(context, bVar, adRequest == null ? null : adRequest.a(), str).b(bVar2);
    }

    public String b() {
        return this.f5770a.a();
    }
}
