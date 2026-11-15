package R4;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f5287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f5288b;

    private b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f5287a = interfaceC4864qQ0;
        this.f5288b = interfaceC4864qQ1;
    }

    public static b a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new b(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    public static a c(Context context, L4.a aVar) {
        return new a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a zzb() {
        return c((Context) this.f5287a.zzb(), (L4.a) this.f5288b.zzb());
    }
}
