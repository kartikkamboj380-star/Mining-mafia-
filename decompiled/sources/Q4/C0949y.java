package Q4;

import com.google.android.gms.internal.ads.EK;
import com.google.android.gms.internal.ads.InterfaceC5307tx0;

/* JADX INFO: renamed from: Q4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0949y implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EK f5056a;

    C0949y(EK ek) {
        this.f5056a = ek;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        this.f5056a.j(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final /* synthetic */ void zzb(Object obj) {
        this.f5056a.j1((M) obj);
    }
}
