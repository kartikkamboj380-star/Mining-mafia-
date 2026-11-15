package Y4;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f6887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f6888b;

    public f() {
        this.f6887a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.f6888b = str;
        return this;
    }

    public f(g gVar) {
        this.f6887a = Boolean.FALSE;
        this.f6887a = Boolean.valueOf(gVar.b());
        this.f6888b = gVar.c();
    }
}
