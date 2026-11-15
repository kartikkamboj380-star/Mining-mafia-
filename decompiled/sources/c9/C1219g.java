package c9;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r9.C7108k;

/* JADX INFO: renamed from: c9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1219g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12043c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1219g f12044d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f12045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p9.c f12046b;

    /* JADX INFO: renamed from: c9.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12047a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final C1219g a() {
            return new C1219g(CollectionsKt.A0(this.f12047a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: c9.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).d();
        }

        public final C7108k b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            C7108k.a aVar = C7108k.f48467d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return C7108k.a.k(aVar, encoded, 0, 0, 3, null).D();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: c9.g$c */
    static final class c extends kotlin.jvm.internal.m implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f12049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12050c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, String str) {
            super(0);
            this.f12049b = list;
            this.f12050c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            List<Certificate> listA;
            p9.c cVarD = C1219g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f12049b, this.f12050c)) == null) {
                listA = this.f12049b;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.s(listA, 10));
            for (Certificate certificate : listA) {
                Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C1219g(Set pins, p9.c cVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f12045a = pins;
        this.f12046b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(hostname, new c(peerCertificates, hostname));
    }

    public final void b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                p070h.w.a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f12043c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            p070h.w.a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f12045a;
        List listI = CollectionsKt.i();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listI;
        }
        p070h.w.a(it.next());
        throw null;
    }

    public final p9.c d() {
        return this.f12046b;
    }

    public final C1219g e(p9.c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.b(this.f12046b, certificateChainCleaner) ? this : new C1219g(this.f12045a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1219g)) {
            return false;
        }
        C1219g c1219g = (C1219g) obj;
        return Intrinsics.b(c1219g.f12045a, this.f12045a) && Intrinsics.b(c1219g.f12046b, this.f12046b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f12045a.hashCode()) * 41;
        p9.c cVar = this.f12046b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C1219g(Set set, p9.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
