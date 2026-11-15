package c9;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum A {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11903b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11911a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a(String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            A a10 = A.HTTP_1_0;
            if (Intrinsics.b(protocol, a10.f11911a)) {
                return a10;
            }
            A a11 = A.HTTP_1_1;
            if (Intrinsics.b(protocol, a11.f11911a)) {
                return a11;
            }
            A a12 = A.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.b(protocol, a12.f11911a)) {
                return a12;
            }
            A a13 = A.HTTP_2;
            if (Intrinsics.b(protocol, a13.f11911a)) {
                return a13;
            }
            A a14 = A.SPDY_3;
            if (Intrinsics.b(protocol, a14.f11911a)) {
                return a14;
            }
            A a15 = A.QUIC;
            if (Intrinsics.b(protocol, a15.f11911a)) {
                return a15;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }
    }

    A(String str) {
        this.f11911a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11911a;
    }
}
