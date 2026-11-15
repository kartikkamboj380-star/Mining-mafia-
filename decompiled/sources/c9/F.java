package c9;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1213a f11961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f11962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f11963c;

    public F(C1213a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f11961a = address;
        this.f11962b = proxy;
        this.f11963c = socketAddress;
    }

    public final C1213a a() {
        return this.f11961a;
    }

    public final Proxy b() {
        return this.f11962b;
    }

    public final boolean c() {
        return this.f11961a.k() != null && this.f11962b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f11963c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return Intrinsics.b(f10.f11961a, this.f11961a) && Intrinsics.b(f10.f11962b, this.f11962b) && Intrinsics.b(f10.f11963c, this.f11963c);
    }

    public int hashCode() {
        return ((((527 + this.f11961a.hashCode()) * 31) + this.f11962b.hashCode()) * 31) + this.f11963c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f11963c + '}';
    }
}
