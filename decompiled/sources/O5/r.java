package O5;

import android.os.RemoteException;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class r extends P5.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7094k f4537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ u f4538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(u uVar, C7094k c7094k, String str, C7094k c7094k2) {
        super(c7094k);
        this.f4538d = uVar;
        this.f4536b = str;
        this.f4537c = c7094k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [P5.k, android.os.IInterface] */
    @Override // P5.q
    protected final void a() {
        try {
            ?? E9 = this.f4538d.f4546a.e();
            u uVar = this.f4538d;
            E9.L0(uVar.f4547b, u.b(uVar, this.f4536b), new t(this.f4538d, this.f4537c, this.f4536b));
        } catch (RemoteException e10) {
            u.f4544e.b(e10, "requestUpdateInfo(%s)", this.f4536b);
            this.f4537c.d(new RuntimeException(e10));
        }
    }
}
