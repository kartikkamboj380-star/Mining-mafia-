package p201u0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7136b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49759b;

    /* JADX INFO: renamed from: u0.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f49760a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f49761b = true;

        public final C7136b a() {
            return new C7136b(this.f49760a, this.f49761b);
        }

        public final a b(String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f49760a = adsSdkName;
            return this;
        }

        public final a c(boolean z9) {
            this.f49761b = z9;
            return this;
        }
    }

    public C7136b(String adsSdkName, boolean z9) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.f49758a = adsSdkName;
        this.f49759b = z9;
    }

    public final String a() {
        return this.f49758a;
    }

    public final boolean b() {
        return this.f49759b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7136b)) {
            return false;
        }
        C7136b c7136b = (C7136b) obj;
        return Intrinsics.b(this.f49758a, c7136b.f49758a) && this.f49759b == c7136b.f49759b;
    }

    public int hashCode() {
        return (this.f49758a.hashCode() * 31) + Boolean.hashCode(this.f49759b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f49758a + ", shouldRecordObservation=" + this.f49759b;
    }
}
