package n9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f47093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f47094b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f47093a = socketAdapterFactory;
    }

    private final synchronized m d(SSLSocket sSLSocket) {
        try {
            if (this.f47094b == null && this.f47093a.a(sSLSocket)) {
                this.f47094b = this.f47093a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47094b;
    }

    @Override // n9.m
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f47093a.a(sslSocket);
    }

    @Override // n9.m
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m mVarD = d(sslSocket);
        if (mVarD != null) {
            return mVarD.b(sslSocket);
        }
        return null;
    }

    @Override // n9.m
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m mVarD = d(sslSocket);
        if (mVarD != null) {
            mVarD.c(sslSocket, str, protocols);
        }
    }

    @Override // n9.m
    public boolean isSupported() {
        return true;
    }
}
