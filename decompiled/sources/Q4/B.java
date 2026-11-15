package Q4;

import com.google.android.gms.internal.ads.AbstractC4738pQ0;
import com.google.android.gms.internal.ads.EnumC3385eg;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f4818a;

    private B(A a10) {
        this.f4818a = a10;
    }

    public static B a(A a10) {
        return new B(a10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        EnumC3385eg enumC3385egC = this.f4818a.c();
        AbstractC4738pQ0.b(enumC3385egC);
        return enumC3385egC;
    }
}
