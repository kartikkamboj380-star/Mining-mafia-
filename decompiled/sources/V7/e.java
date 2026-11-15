package V7;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6136a;

        static {
            int[] iArr = new int[U7.d.values().length];
            f6136a = iArr;
            try {
                iArr[U7.d.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6136a[U7.d.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6136a[U7.d.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private V7.b f6137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f6138b;

        public b(V7.b bVar, f fVar) {
            this.f6137a = bVar;
            this.f6138b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map mapC = this.f6138b.c();
            if (mapC.size() > 0) {
                this.f6137a.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f6138b.b() == null) {
                this.f6137a.onSignalsCollected("");
            } else {
                this.f6137a.onSignalsCollectionFailed(this.f6138b.b());
            }
        }
    }

    @Override // V7.c
    public void a(Context context, boolean z9, V7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        e(context, U7.d.INTERSTITIAL, aVar, fVar);
        aVar.a();
        e(context, U7.d.REWARDED, aVar, fVar);
        if (z9) {
            aVar.a();
            e(context, U7.d.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // V7.c
    public void b(Context context, List list, V7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            U7.d dVar = (U7.d) it.next();
            aVar.a();
            e(context, dVar, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // V7.c
    public void c(Context context, String str, U7.d dVar, V7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        d(context, str, dVar, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    public String f(U7.d dVar) {
        int i10 = a.f6136a[dVar.ordinal()];
        if (i10 == 1) {
            return "gmaScarBiddingBannerSignal";
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : "gmaScarBiddingRewardedSignal";
        }
        return "gmaScarBiddingInterstitialSignal";
    }
}
