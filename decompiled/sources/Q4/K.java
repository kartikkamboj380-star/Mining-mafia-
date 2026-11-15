package Q4;

import H4.C0654z;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC5685wx0;
import com.google.android.gms.internal.ads.C5420ur;
import com.google.android.gms.internal.ads.GV;
import com.google.android.gms.internal.ads.InterfaceC3294dx0;
import com.google.android.gms.internal.ads.RU;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements InterfaceC3294dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f4841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RU f4842b;

    public K(Executor executor, RU ru) {
        this.f4841a = executor;
        this.f4842b = ru;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
        final C5420ur c5420ur = (C5420ur) obj;
        return AbstractC5685wx0.j(this.f4842b.a(c5420ur), new InterfaceC3294dx0() { // from class: Q4.J
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj2) {
                GV gv = (GV) obj2;
                M m10 = new M(new JsonReader(new InputStreamReader(gv.a())), gv.b());
                C5420ur c5420ur2 = c5420ur;
                try {
                    m10.f4845b = C0654z.a().v(c5420ur2.f33908a).toString();
                } catch (JSONException unused) {
                    m10.f4845b = "{}";
                }
                Bundle bundle = c5420ur2.f33921v;
                if (!bundle.isEmpty()) {
                    try {
                        m10.f4846c = C0654z.a().v(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return AbstractC5685wx0.a(m10);
            }
        }, this.f4841a);
    }
}
