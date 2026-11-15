package T6;

/* JADX INFO: loaded from: classes3.dex */
public class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final R6.a f5778c = R6.a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y6.c f5779b;

    a(Y6.c cVar) {
        this.f5779b = cVar;
    }

    private boolean g() {
        Y6.c cVar = this.f5779b;
        if (cVar == null) {
            f5778c.j("ApplicationInfo is null");
            return false;
        }
        if (!cVar.s()) {
            f5778c.j("GoogleAppId is null");
            return false;
        }
        if (!this.f5779b.q()) {
            f5778c.j("AppInstanceId is null");
            return false;
        }
        if (!this.f5779b.r()) {
            f5778c.j("ApplicationProcessState is null");
            return false;
        }
        if (!this.f5779b.p()) {
            return true;
        }
        if (!this.f5779b.m().l()) {
            f5778c.j("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f5779b.m().m()) {
            return true;
        }
        f5778c.j("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    @Override // T6.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f5778c.j("ApplicationInfo is invalid");
        return false;
    }
}
