package K4;

import com.google.android.gms.internal.ads.C8;
import com.google.android.gms.internal.ads.H8;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class I implements C8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f2619b;

    I(N n10, String str, K k10) {
        this.f2618a = str;
        this.f2619b = k10;
        Objects.requireNonNull(n10);
    }

    @Override // com.google.android.gms.internal.ads.C8
    public final void a(H8 h10) {
        String str = this.f2618a;
        String string = h10.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        String string2 = sb.toString();
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f(string2);
        this.f2619b.zza(null);
    }
}
