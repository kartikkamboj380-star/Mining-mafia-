package B7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends D4.a.AbstractC0017a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f306a;

    public b(c cVar) {
        this.f306a = cVar;
    }

    @Override // B4.e
    public final void a(B4.k loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
        this.f306a.i("ad load failed due to " + loadAdError);
        this.f306a.f308b.b(loadAdError);
    }

    @Override // B4.e
    public final void b(Object obj) {
        D4.a ad = (D4.a) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f306a.i("ad loaded");
        c cVar = this.f306a;
        cVar.f310d = (N4.i) cVar.f308b.onSuccess(cVar);
        this.f306a.f309c = ad;
        if (ad == null) {
            Intrinsics.r("adManagerAppOpenAd");
            ad = null;
        }
        ad.c(this.f306a);
    }
}
