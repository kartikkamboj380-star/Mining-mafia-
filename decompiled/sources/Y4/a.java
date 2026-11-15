package Y4;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api f6875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Api f6876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z4.a f6877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p006a5.a f6878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Api.ClientKey f6879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Api.ClientKey f6880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f6881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f6882h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f6879e = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f6880f = clientKey2;
        d dVar = new d();
        f6881g = dVar;
        e eVar = new e();
        f6882h = eVar;
        f6875a = b.f6883a;
        new Api("Auth.CREDENTIALS_API", dVar, clientKey);
        f6876b = new Api("Auth.GOOGLE_SIGN_IN_API", eVar, clientKey2);
        f6877c = b.f6884b;
        f6878d = new p016b5.h();
    }
}
