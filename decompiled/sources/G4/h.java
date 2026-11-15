package G4;

import com.google.android.gms.internal.ads.InterfaceC3390ei0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class h implements InterfaceC3390ei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f945a;

    h(k kVar) {
        Objects.requireNonNull(kVar);
        this.f945a = kVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ei0
    public final void a(int i10, long j10, String str) {
        this.f945a.o().f(i10, System.currentTimeMillis() - j10, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3390ei0
    public final void b(int i10, long j10) {
        this.f945a.o().b(i10, System.currentTimeMillis() - j10);
    }
}
