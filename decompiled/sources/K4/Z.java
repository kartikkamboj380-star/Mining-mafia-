package K4;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0762c0 f2642b;

    public Z(C0762c0 c0762c0, String str) {
        Objects.requireNonNull(c0762c0);
        this.f2642b = c0762c0;
        this.f2641a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C0762c0 c0762c0 = this.f2642b;
        synchronized (c0762c0) {
            try {
                Iterator it = c0762c0.d().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0758a0) it.next()).a(sharedPreferences, this.f2641a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
