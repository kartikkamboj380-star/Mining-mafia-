package X4;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.AbstractBinderC6099k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f6703b;

    g(String str, Bundle bundle) {
        this.f6702a = str;
        this.f6703b = bundle;
    }

    @Override // X4.h
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws a, IOException {
        Bundle bundleC3 = AbstractBinderC6099k0.h0(iBinder).c3(this.f6702a, this.f6703b);
        i.f(bundleC3);
        String string = bundleC3.getString("Error");
        if (bundleC3.getBoolean("booleanResult")) {
            return null;
        }
        throw new a(string);
    }
}
