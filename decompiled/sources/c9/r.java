package c9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12229a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f12230b = new a();

    public static final class a extends r {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        r a(InterfaceC1217e interfaceC1217e);
    }

    public void A(InterfaceC1217e call, D response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void B(InterfaceC1217e call, s sVar) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void C(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void a(InterfaceC1217e call, D cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void b(InterfaceC1217e call, D response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void c(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void d(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void e(InterfaceC1217e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void f(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void g(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void h(InterfaceC1217e call, InetSocketAddress inetSocketAddress, Proxy proxy, A a10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void i(InterfaceC1217e call, InetSocketAddress inetSocketAddress, Proxy proxy, A a10, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void j(InterfaceC1217e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void k(InterfaceC1217e call, j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void l(InterfaceC1217e call, j connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void m(InterfaceC1217e call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void n(InterfaceC1217e call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void o(InterfaceC1217e call, u url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void p(InterfaceC1217e call, u url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void q(InterfaceC1217e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void r(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void s(InterfaceC1217e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void t(InterfaceC1217e call, B request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void u(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void v(InterfaceC1217e call, long j10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void w(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void x(InterfaceC1217e call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void y(InterfaceC1217e call, D response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void z(InterfaceC1217e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
