package Q4;

import K4.F0;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AK;

/* JADX INFO: loaded from: classes2.dex */
public final class O implements AK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f4854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4856c;

    public O(C c10, int i10, String str) {
        this.f4854a = c10;
        this.f4855b = i10;
        this.f4856c = str;
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void a(final M m10) {
        if (m10 == null || this.f4855b != 2 || TextUtils.isEmpty(this.f4856c)) {
            return;
        }
        F0.U(new Runnable() { // from class: Q4.N
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f4852a.b(m10);
            }
        });
    }

    final /* synthetic */ void b(M m10) {
        this.f4854a.a(this.f4856c, m10);
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void k(String str) {
    }
}
