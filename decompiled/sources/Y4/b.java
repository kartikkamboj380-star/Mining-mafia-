package Y4;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.C6083f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api f6883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z4.a f6884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Api.ClientKey f6885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f6886d;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f6885c = clientKey;
        h hVar = new h();
        f6886d = hVar;
        f6883a = new Api("Auth.PROXY_API", hVar, clientKey);
        f6884b = new C6083f();
    }
}
