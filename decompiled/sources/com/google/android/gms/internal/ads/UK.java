package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class UK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HL f23980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1750Fw f23981b;

    public UK(HL hl, InterfaceC1750Fw interfaceC1750Fw) {
        this.f23980a = hl;
        this.f23981b = interfaceC1750Fw;
    }

    public final HL a() {
        return this.f23980a;
    }

    public final InterfaceC1750Fw b() {
        return this.f23981b;
    }

    public final View c() {
        InterfaceC1750Fw interfaceC1750Fw = this.f23981b;
        if (interfaceC1750Fw != null) {
            return interfaceC1750Fw.A();
        }
        return null;
    }

    public final View d() {
        InterfaceC1750Fw interfaceC1750Fw = this.f23981b;
        if (interfaceC1750Fw == null) {
            return null;
        }
        return interfaceC1750Fw.A();
    }

    public Set e(C3959jF c3959jF) {
        return Collections.singleton(new C3593gK(c3959jF, AbstractC2315Qt.f22479g));
    }

    public Set f(C3959jF c3959jF) {
        return Collections.singleton(new C3593gK(c3959jF, AbstractC2315Qt.f22479g));
    }

    public final C3593gK g(Executor executor) {
        final InterfaceC1750Fw interfaceC1750Fw = this.f23981b;
        return new C3593gK(new BI() { // from class: com.google.android.gms.internal.ads.SK
            @Override // com.google.android.gms.internal.ads.BI
            public final /* synthetic */ void zza() {
                J4.z zVarJ;
                InterfaceC1750Fw interfaceC1750Fw2 = interfaceC1750Fw;
                if (interfaceC1750Fw2 == null || (zVarJ = interfaceC1750Fw2.J()) == null) {
                    return;
                }
                zVarJ.zzb();
            }
        }, executor);
    }
}
