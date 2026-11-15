package i9;

import c9.B;
import c9.u;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f45142a = new i();

    private i() {
    }

    private final boolean b(B b10, Proxy.Type type) {
        return !b10.i() && type == Proxy.Type.HTTP;
    }

    public final String a(B request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.j());
        sb.append(' ');
        i iVar = f45142a;
        if (iVar.b(request, proxyType)) {
            sb.append(request.n());
        } else {
            sb.append(iVar.c(request.n()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
