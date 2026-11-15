package G4;

import K4.F0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3031br;
import com.google.android.gms.internal.ads.InterfaceC1898Is;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1898Is f935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3031br f936d = new C3031br(false, Collections.EMPTY_LIST);

    public b(Context context, InterfaceC1898Is interfaceC1898Is, C3031br c3031br) {
        this.f933a = context;
        this.f935c = interfaceC1898Is;
    }

    private final boolean d() {
        InterfaceC1898Is interfaceC1898Is = this.f935c;
        return (interfaceC1898Is != null && interfaceC1898Is.zza().f18858f) || this.f936d.f26946a;
    }

    public final void a() {
        this.f934b = true;
    }

    public final boolean b() {
        return !d() || this.f934b;
    }

    public final void c(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            InterfaceC1898Is interfaceC1898Is = this.f935c;
            if (interfaceC1898Is != null) {
                interfaceC1898Is.a(str, null, 3);
                return;
            }
            C3031br c3031br = this.f936d;
            if (!c3031br.f26946a || (list = c3031br.f26947b) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f933a;
                    t.g();
                    F0.q(context, "", strReplace);
                }
            }
        }
    }
}
