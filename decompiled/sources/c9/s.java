package c9;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12231e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f12232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1221i f12233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f12235d;

    public static final class a {

        /* JADX INFO: renamed from: c9.s$a$a, reason: collision with other inner class name */
        static final class C0204a extends kotlin.jvm.internal.m implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f12236a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0204a(List list) {
                super(0);
                this.f12236a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List invoke() {
                return this.f12236a;
            }
        }

        static final class b extends kotlin.jvm.internal.m implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f12237a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f12237a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List invoke() {
                return this.f12237a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? d9.e.w(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.i();
        }

        public final s a(G tlsVersion, C1221i cipherSuite, List peerCertificates, List localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new s(tlsVersion, cipherSuite, d9.e.V(localCertificates), new C0204a(d9.e.V(peerCertificates)));
        }

        public final s b(SSLSession sSLSession) throws IOException {
            List listI;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C1221i c1221iB = C1221i.f12107b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            G gA = G.f11964b.a(protocol);
            try {
                listI = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listI = CollectionsKt.i();
            }
            return new s(gA, c1221iB, c(sSLSession.getLocalCertificates()), new b(listI));
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.m implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f12238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(0);
            this.f12238a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            try {
                return (List) this.f12238a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.i();
            }
        }
    }

    public s(G tlsVersion, C1221i cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f12232a = tlsVersion;
        this.f12233b = cipherSuite;
        this.f12234c = localCertificates;
        this.f12235d = p129m8.g.a(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    public final C1221i a() {
        return this.f12233b;
    }

    public final List c() {
        return this.f12234c;
    }

    public final List d() {
        return (List) this.f12235d.getValue();
    }

    public final G e() {
        return this.f12232a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f12232a == this.f12232a && Intrinsics.b(sVar.f12233b, this.f12233b) && Intrinsics.b(sVar.d(), d()) && Intrinsics.b(sVar.f12234c, this.f12234c);
    }

    public int hashCode() {
        return ((((((527 + this.f12232a.hashCode()) * 31) + this.f12233b.hashCode()) * 31) + d().hashCode()) * 31) + this.f12234c.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f12232a);
        sb.append(" cipherSuite=");
        sb.append(this.f12233b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f12234c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
