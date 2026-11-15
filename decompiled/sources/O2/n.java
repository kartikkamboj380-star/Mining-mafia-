package O2;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class n implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f4492d = d(Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f4493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f4494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f4495c;

    private n(int i10, boolean z9, boolean z10) {
        this.f4493a = i10;
        this.f4494b = z9;
        this.f4495c = z10;
    }

    public static o d(int i10, boolean z9, boolean z10) {
        return new n(i10, z9, z10);
    }

    @Override // O2.o
    public boolean a() {
        return this.f4495c;
    }

    @Override // O2.o
    public boolean b() {
        return this.f4494b;
    }

    @Override // O2.o
    public int c() {
        return this.f4493a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f4493a == nVar.f4493a && this.f4494b == nVar.f4494b && this.f4495c == nVar.f4495c;
    }

    public int hashCode() {
        return (this.f4493a ^ (this.f4494b ? 4194304 : 0)) ^ (this.f4495c ? 8388608 : 0);
    }
}
