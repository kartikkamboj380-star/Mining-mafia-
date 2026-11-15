package p077h6;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Locale;
import p037d6.a;
import p087i6.g;
import p097j6.b;

/* JADX INFO: loaded from: classes3.dex */
class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f44795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f44796b;

    e() {
    }

    private static void b(b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f44795a : this.f44796b, str, bundle);
    }

    @Override // d6.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString(MediationMetaData.KEY_NAME)) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(b bVar) {
        this.f44796b = bVar;
    }

    public void e(b bVar) {
        this.f44795a = bVar;
    }
}
