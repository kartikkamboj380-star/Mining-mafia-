package H4;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class I1 extends N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ J1 f1232a;

    /* synthetic */ I1(J1 j10, byte[] bArr) {
        Objects.requireNonNull(j10);
        this.f1232a = j10;
    }

    @Override // H4.O
    public final void T0(h2 h2Var, int i10) {
        L4.p.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        L4.g.f3110b.post(new H1(this));
    }

    @Override // H4.O
    public final String b() {
        return null;
    }

    @Override // H4.O
    public final String c() {
        return null;
    }

    @Override // H4.O
    public final void v0(h2 h2Var) {
        T0(h2Var, 1);
    }

    @Override // H4.O
    public final boolean zzg() {
        return false;
    }
}
