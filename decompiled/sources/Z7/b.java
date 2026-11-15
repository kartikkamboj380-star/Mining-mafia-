package Z7;

import U7.d;
import V7.c;
import V7.e;
import V7.f;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class b extends e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X7.a f7172a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7173a;

        static {
            int[] iArr = new int[d.values().length];
            f7173a = iArr;
            try {
                iArr[d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7173a[d.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7173a[d.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(X7.a aVar) {
        this.f7172a = aVar;
    }

    @Override // V7.c
    public void d(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        T4.a.a(context, g(dVar), this.f7172a.a(), new Z7.a(str, new V7.d(aVar, fVar)));
    }

    @Override // V7.c
    public void e(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(dVar), dVar, aVar, fVar);
    }

    public B4.b g(d dVar) {
        int i10 = a.f7173a[dVar.ordinal()];
        if (i10 == 1) {
            return B4.b.BANNER;
        }
        if (i10 != 2) {
            return i10 != 3 ? B4.b.UNKNOWN : B4.b.REWARDED;
        }
        return B4.b.INTERSTITIAL;
    }
}
