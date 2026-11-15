package H4;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.AbstractBinderC2042Lm;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: H4.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC0647w1 extends AbstractBinderC2042Lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0650x1 f1451a;

    /* synthetic */ BinderC0647w1(C0650x1 c0650x1, byte[] bArr) {
        Objects.requireNonNull(c0650x1);
        this.f1451a = c0650x1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2093Mm
    public final void e3(List list) {
        int i10;
        ArrayList arrayList;
        C0650x1 c0650x1 = this.f1451a;
        synchronized (c0650x1.y()) {
            c0650x1.A(false);
            c0650x1.B(true);
            arrayList = new ArrayList(c0650x1.z());
            c0650x1.z().clear();
        }
        InitializationStatus initializationStatusB = C0650x1.b(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(initializationStatusB);
        }
    }
}
