package p019b8;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T7.a f11644a;

    public a(T7.a aVar) {
        this.f11644a = aVar;
    }

    public AdRequest a() {
        return c().n();
    }

    public AdRequest b(String str) {
        return str.isEmpty() ? a() : ((AdRequest.Builder) c().f(str)).n();
    }

    public AdRequest.Builder c() {
        return (AdRequest.Builder) ((AdRequest.Builder) new AdRequest.Builder().i(this.f11644a.b())).d(AdMobAdapter.class, this.f11644a.a());
    }
}
