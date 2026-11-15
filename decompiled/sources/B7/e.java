package B7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends C4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f317a;

    public e(f fVar) {
        this.f317a = fVar;
    }

    @Override // B4.e
    public final void a(B4.k adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f317a.i("ad load failed due to " + adError);
        this.f317a.f319b.b(adError);
    }

    @Override // B4.e
    public final void b(Object obj) {
        C4.c interstitialAd = (C4.c) obj;
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        this.f317a.i("ad loaded");
        f fVar = this.f317a;
        fVar.f321d = (N4.r) fVar.f319b.onSuccess(fVar);
        this.f317a.f320c = interstitialAd;
        if (interstitialAd == null) {
            Intrinsics.r("adManagerInterstitialAd");
            interstitialAd = null;
        }
        interstitialAd.c(this.f317a);
    }
}
