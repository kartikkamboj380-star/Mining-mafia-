package B4;

import H4.C0654z;
import H4.InterfaceC0608j0;
import android.content.Context;
import com.google.android.gms.internal.ads.BinderC5162so;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile InterfaceC0608j0 f287a;

    public static InterfaceC0608j0 a(Context context) {
        if (f287a == null) {
            synchronized (y.class) {
                try {
                    if (f287a == null) {
                        f287a = C0654z.b().d(context, new BinderC5162so());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f287a;
    }
}
