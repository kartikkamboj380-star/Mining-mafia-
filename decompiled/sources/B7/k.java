package B7;

import N4.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends U4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f333a;

    public k(m mVar) {
        this.f333a = mVar;
    }

    @Override // B4.e
    public final void a(B4.k adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f333a.j("ad load failed due to " + adError);
        this.f333a.f337c = null;
        this.f333a.f336b.b(adError);
    }

    @Override // B4.e
    public final void b(Object obj) {
        U4.c ad = (U4.c) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f333a.j("ad loaded");
        m mVar = this.f333a;
        mVar.f338d = (y) mVar.f336b.onSuccess(mVar);
        m mVar2 = this.f333a;
        mVar2.f337c = ad;
        if (ad != null) {
            ad.e(mVar2);
        }
    }
}
