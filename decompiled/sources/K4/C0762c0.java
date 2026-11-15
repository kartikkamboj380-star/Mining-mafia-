package K4;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: K4.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0762c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2650a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f2651b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2652c;

    C0762c0(Context context) {
        this.f2652c = context;
    }

    public final void a() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Sb)).booleanValue()) {
            G4.t.g();
            final Map mapM0 = F0.m0((String) H4.B.c().d(AbstractC3892ii.Xb));
            Iterator it = mapM0.keySet().iterator();
            while (it.hasNext()) {
                c((String) it.next());
            }
            b(new InterfaceC0758a0() { // from class: K4.b0
                @Override // K4.InterfaceC0758a0
                public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str, String str2) {
                    Map map = mapM0;
                    if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                        G4.t.l().r().H0(false);
                    }
                }
            });
        }
    }

    final synchronized void b(InterfaceC0758a0 interfaceC0758a0) {
        this.f2651b.add(interfaceC0758a0);
    }

    final synchronized void c(String str) {
        try {
            Map map = this.f2650a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f2652c) : this.f2652c.getSharedPreferences(str, 0);
            Z z9 = new Z(this, str);
            map.put(str, z9);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(z9);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ List d() {
        return this.f2651b;
    }
}
