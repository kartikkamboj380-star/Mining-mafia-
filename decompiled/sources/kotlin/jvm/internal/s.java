package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements InterfaceC7035e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f45988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45989b;

    public s(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f45988a = jClass;
        this.f45989b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC7035e
    public Class b() {
        return this.f45988a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && Intrinsics.b(b(), ((s) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
