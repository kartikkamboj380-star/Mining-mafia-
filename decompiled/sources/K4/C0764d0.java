package K4;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: renamed from: K4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0764d0 extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2653c;

    C0764d0(Context context) {
        this.f2653c = context;
    }

    @Override // K4.B
    public final void a() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f2653c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Fail to get isAdIdFakeForDebugLogging", e10);
            isAdIdFakeForDebugLogging = false;
        }
        L4.m.h(isAdIdFakeForDebugLogging);
        StringBuilder sb = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
        sb.append("Update ad debug logging enablement as ");
        sb.append(isAdIdFakeForDebugLogging);
        String string = sb.toString();
        int i11 = AbstractC0786o0.f2696b;
        L4.p.f(string);
    }
}
