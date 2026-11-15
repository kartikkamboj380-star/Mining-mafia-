package C4;

import B4.w;
import B4.x;
import H4.B;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC3894ij;
import com.google.android.gms.internal.ads.C2205Oq;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.google.android.gms.ads.c {
    public b(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public void e(final a aVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        AbstractC3892ii.a(getContext());
        if (((Boolean) AbstractC3894ij.f30049f.e()).booleanValue()) {
            if (((Boolean) B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                L4.c.f3105b.execute(new Runnable() { // from class: C4.f
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f371a.g(aVar);
                    }
                });
                return;
            }
        }
        this.f16817a.m(aVar.a());
    }

    public void f() {
        this.f16817a.o();
    }

    final /* synthetic */ void g(a aVar) {
        try {
            this.f16817a.m(aVar.a());
        } catch (IllegalStateException e10) {
            C2205Oq.c(getContext()).b(e10, "AdManagerAdView.loadAd");
        }
    }

    public B4.f[] getAdSizes() {
        return this.f16817a.j();
    }

    public e getAppEventListener() {
        return this.f16817a.l();
    }

    @NonNull
    public w getVideoController() {
        return this.f16817a.C();
    }

    public x getVideoOptions() {
        return this.f16817a.b();
    }

    public void setAdSizes(@NonNull B4.f... fVarArr) {
        if (fVarArr == null || fVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f16817a.t(fVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f16817a.v(eVar);
    }

    public void setManualImpressionsEnabled(boolean z9) {
        this.f16817a.w(z9);
    }

    public void setVideoOptions(@NonNull x xVar) {
        this.f16817a.a(xVar);
    }
}
