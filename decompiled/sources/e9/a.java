package e9;

import c9.B;
import c9.C1213a;
import c9.C1220h;
import c9.D;
import c9.F;
import c9.InterfaceC1214b;
import c9.o;
import c9.q;
import c9.u;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC1214b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f43523d;

    /* JADX INFO: renamed from: e9.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0420a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43524a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43524a = iArr;
        }
    }

    public a(q defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f43523d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0420a.f43524a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.W(qVar.a(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // c9.InterfaceC1214b
    public B a(F f10, D response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C1213a c1213aA;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C1220h> listX = response.x();
        B bV0 = response.V0();
        u uVarN = bV0.n();
        boolean z9 = response.G() == 407;
        if (f10 == null || (proxy = f10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C1220h c1220h : listX) {
            if (StringsKt.y("Basic", c1220h.c(), true)) {
                if (f10 == null || (c1213aA = f10.a()) == null || (qVarC = c1213aA.c()) == null) {
                    qVarC = this.f43523d;
                }
                if (z9) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarN, qVarC), inetSocketAddress.getPort(), uVarN.q(), c1220h.b(), c1220h.c(), uVarN.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarN.h();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarN, qVarC), uVarN.m(), uVarN.q(), c1220h.b(), c1220h.c(), uVarN.s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z9 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return bV0.k().e(str, o.a(userName, new String(password), c1220h.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f12227b : qVar);
    }
}
