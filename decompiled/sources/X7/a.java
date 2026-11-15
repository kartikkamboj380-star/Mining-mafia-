package X7;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T7.a f6774a;

    public a(T7.a aVar) {
        this.f6774a = aVar;
    }

    public AdRequest a() {
        return c().n();
    }

    public AdRequest b(String str) {
        return str.isEmpty() ? a() : c().setAdString(str).n();
    }

    public AdRequest.Builder c() {
        return new AdRequest.Builder().setRequestAgent(this.f6774a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f6774a.a());
    }
}
