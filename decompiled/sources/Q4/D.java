package Q4;

import com.google.android.gms.internal.ads.AbstractC4738pQ0;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f4824a;

    private D(A a10) {
        this.f4824a = a10;
    }

    public static D a(A a10) {
        return new D(a10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        String strB = this.f4824a.b();
        AbstractC4738pQ0.b(strB);
        return strB;
    }
}
