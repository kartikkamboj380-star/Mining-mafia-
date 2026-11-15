package n9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47091a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l.a f47092b = new a();

    public static final class a implements l.a {
        a() {
        }

        @Override // n9.l.a
        public boolean a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return m9.d.f46477e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // n9.l.a
        public m b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new k();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l.a a() {
            return k.f47092b;
        }

        private b() {
        }
    }

    @Override // n9.m
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // n9.m
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // n9.m
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) m9.j.f46495a.b(protocols).toArray(new String[0]));
        }
    }

    @Override // n9.m
    public boolean isSupported() {
        return m9.d.f46477e.c();
    }
}
