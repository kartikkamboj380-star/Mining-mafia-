package p240y;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e implements i {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e[] f50755w0 = new e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f50756x0 = 0;

    @Override // p240y.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f50756x0 + 1;
        e[] eVarArr = this.f50755w0;
        if (i10 > eVarArr.length) {
            this.f50755w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f50755w0;
        int i11 = this.f50756x0;
        eVarArr2[i11] = eVar;
        this.f50756x0 = i11 + 1;
    }

    @Override // p240y.i
    public void c() {
        this.f50756x0 = 0;
        Arrays.fill(this.f50755w0, (Object) null);
    }

    @Override // p240y.i
    public void b(f fVar) {
    }
}
