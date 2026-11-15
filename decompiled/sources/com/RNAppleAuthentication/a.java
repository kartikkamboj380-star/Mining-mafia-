package com.RNAppleAuthentication;

import com.google.android.gms.common.Scopes;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f12397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12398g;

    /* JADX INFO: renamed from: com.RNAppleAuthentication.a$a, reason: collision with other inner class name */
    public static final class C0207a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f12401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f12402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f12403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f12404f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f12405g;

        public final a a() {
            String str = this.f12399a;
            String str2 = null;
            if (str == null) {
                Intrinsics.r("clientId");
                str = null;
            }
            String str3 = this.f12400b;
            if (str3 == null) {
                Intrinsics.r("redirectUri");
                str3 = null;
            }
            String str4 = this.f12401c;
            if (str4 == null) {
                Intrinsics.r("scope");
                str4 = null;
            }
            String str5 = this.f12402d;
            if (str5 == null) {
                Intrinsics.r("responseType");
                str5 = null;
            }
            String str6 = this.f12403e;
            if (str6 == null) {
                Intrinsics.r("state");
                str6 = null;
            }
            String str7 = this.f12404f;
            if (str7 == null) {
                Intrinsics.r("rawNonce");
                str7 = null;
            }
            String str8 = this.f12405g;
            if (str8 == null) {
                Intrinsics.r("nonce");
            } else {
                str2 = str8;
            }
            return new a(str, str3, str4, str5, str6, str7, str2, null);
        }

        public final C0207a b(String clientId) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            this.f12399a = clientId;
            return this;
        }

        public final C0207a c(String nonce) {
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            this.f12405g = nonce;
            return this;
        }

        public final C0207a d(String rawNonce) {
            Intrinsics.checkNotNullParameter(rawNonce, "rawNonce");
            this.f12404f = rawNonce;
            return this;
        }

        public final C0207a e(String redirectUri) {
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            this.f12400b = redirectUri;
            return this;
        }

        public final C0207a f(b type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f12402d = type.d();
            return this;
        }

        public final C0207a g(c scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f12401c = scope.d();
            return this;
        }

        public final C0207a h(String state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f12403e = state;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12406a = new C0209b("CODE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f12407b = new c("ID_TOKEN", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f12408c = new C0208a("ALL", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f12409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f12410e;

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$b$a, reason: collision with other inner class name */
        static final class C0208a extends b {
            C0208a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String d() {
                return "code id_token";
            }
        }

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$b$b, reason: collision with other inner class name */
        static final class C0209b extends b {
            C0209b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String d() {
                return "code";
            }
        }

        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String d() {
                return "id_token";
            }
        }

        static {
            b[] bVarArrC = c();
            f12409d = bVarArrC;
            f12410e = p189s8.a.a(bVarArrC);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f12406a, f12407b, f12408c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12409d.clone();
        }

        public abstract String d();

        private b(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12411a = new C0211c("NAME", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f12412b = new b("EMAIL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12413c = new C0210a("ALL", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f12414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f12415e;

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$c$a, reason: collision with other inner class name */
        static final class C0210a extends c {
            C0210a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String d() {
                return "name email";
            }
        }

        static final class b extends c {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String d() {
                return Scopes.EMAIL;
            }
        }

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$c$c, reason: collision with other inner class name */
        static final class C0211c extends c {
            C0211c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String d() {
                return MediationMetaData.KEY_NAME;
            }
        }

        static {
            c[] cVarArrC = c();
            f12414d = cVarArrC;
            f12415e = p189s8.a.a(cVarArrC);
        }

        public /* synthetic */ c(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ c[] c() {
            return new c[]{f12411a, f12412b, f12413c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f12414d.clone();
        }

        public abstract String d();

        private c(String str, int i10) {
            super(str, i10);
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    public final String a() {
        return this.f12392a;
    }

    public final String b() {
        return this.f12398g;
    }

    public final String c() {
        return this.f12397f;
    }

    public final String d() {
        return this.f12393b;
    }

    public final String e() {
        return this.f12395d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f12392a, aVar.f12392a) && Intrinsics.b(this.f12393b, aVar.f12393b) && Intrinsics.b(this.f12394c, aVar.f12394c) && Intrinsics.b(this.f12395d, aVar.f12395d) && Intrinsics.b(this.f12396e, aVar.f12396e) && Intrinsics.b(this.f12397f, aVar.f12397f) && Intrinsics.b(this.f12398g, aVar.f12398g);
    }

    public final String f() {
        return this.f12394c;
    }

    public final String g() {
        return this.f12396e;
    }

    public int hashCode() {
        return (((((((((((this.f12392a.hashCode() * 31) + this.f12393b.hashCode()) * 31) + this.f12394c.hashCode()) * 31) + this.f12395d.hashCode()) * 31) + this.f12396e.hashCode()) * 31) + this.f12397f.hashCode()) * 31) + this.f12398g.hashCode();
    }

    public String toString() {
        return "SignInWithAppleConfiguration(clientId=" + this.f12392a + ", redirectUri=" + this.f12393b + ", scope=" + this.f12394c + ", responseType=" + this.f12395d + ", state=" + this.f12396e + ", rawNonce=" + this.f12397f + ", nonce=" + this.f12398g + ")";
    }

    private a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f12392a = str;
        this.f12393b = str2;
        this.f12394c = str3;
        this.f12395d = str4;
        this.f12396e = str5;
        this.f12397f = str6;
        this.f12398g = str7;
    }
}
