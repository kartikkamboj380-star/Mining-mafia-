package p156p5;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api.ClientKey f47897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Api.ClientKey f47898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Api.AbstractClientBuilder f47899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Api.AbstractClientBuilder f47900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f47901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f47902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Api f47903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Api f47904h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f47897a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f47898b = clientKey2;
        b bVar = new b();
        f47899c = bVar;
        c cVar = new c();
        f47900d = cVar;
        f47901e = new Scope(Scopes.PROFILE);
        f47902f = new Scope(Scopes.EMAIL);
        f47903g = new Api("SignIn.API", bVar, clientKey);
        f47904h = new Api("SignIn.INTERNAL_API", cVar, clientKey2);
    }
}
