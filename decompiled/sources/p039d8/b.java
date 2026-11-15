package p039d8;

import U7.d;
import V7.c;
import V7.e;
import V7.f;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class b extends e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p019b8.a f43181a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43182a;

        static {
            int[] iArr = new int[d.values().length];
            f43182a = iArr;
            try {
                iArr[d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43182a[d.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(p019b8.a aVar) {
        this.f43181a = aVar;
    }

    @Override // V7.c
    public void d(Context context, String str, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        T4.a.a(context, g(dVar), this.f43181a.a(), new p039d8.a(str, new V7.d(aVar, fVar)));
    }

    @Override // V7.c
    public void e(Context context, d dVar, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(dVar), dVar, aVar, fVar);
    }

    public B4.b g(d dVar) {
        int i10 = a.f43182a[dVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? B4.b.INTERSTITIAL : B4.b.REWARDED;
        }
        return B4.b.BANNER;
    }
}
