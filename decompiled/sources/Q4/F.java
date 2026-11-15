package Q4;

import com.google.android.gms.internal.ads.InterfaceC3732hQ0;

/* JADX INFO: loaded from: classes2.dex */
public final class F implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f4826a;

    private F(A a10) {
        this.f4826a = a10;
    }

    public static F a(A a10) {
        return new F(a10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f4826a.d();
    }
}
