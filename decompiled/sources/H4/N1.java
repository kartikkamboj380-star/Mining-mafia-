package H4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2093Mm;
import com.google.android.gms.internal.ads.InterfaceC5666wo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 extends A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2093Mm f1239a;

    @Override // H4.B0
    public final void L4(InterfaceC2093Mm interfaceC2093Mm) {
        this.f1239a = interfaceC2093Mm;
    }

    @Override // H4.B0
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // H4.B0
    public final String e() {
        return "";
    }

    final /* synthetic */ void zzb() {
        InterfaceC2093Mm interfaceC2093Mm = this.f1239a;
        if (interfaceC2093Mm != null) {
            try {
                interfaceC2093Mm.e3(Collections.EMPTY_LIST);
            } catch (RemoteException e10) {
                L4.p.g("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // H4.B0
    public final void zze() {
        L4.p.c("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        L4.g.f3110b.post(new Runnable() { // from class: H4.M1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f1238a.zzb();
            }
        });
    }

    @Override // H4.B0
    public final float zzk() {
        return 1.0f;
    }

    @Override // H4.B0
    public final boolean zzl() {
        return false;
    }

    @Override // H4.B0
    public final void f() {
    }

    @Override // H4.B0
    public final void p() {
    }

    @Override // H4.B0
    public final void M0(U1 u10) {
    }

    @Override // H4.B0
    public final void S0(boolean z9) {
    }

    @Override // H4.B0
    public final void U(boolean z9) {
    }

    @Override // H4.B0
    public final void b0(String str) {
    }

    @Override // H4.B0
    public final void b1(M0 m10) {
    }

    @Override // H4.B0
    public final void b6(InterfaceC5666wo interfaceC5666wo) {
    }

    @Override // H4.B0
    public final void g0(String str) {
    }

    @Override // H4.B0
    public final void m0(float f10) {
    }

    @Override // H4.B0
    public final void o0(String str) {
    }

    @Override // H4.B0
    public final void F1(String str, com.google.android.gms.dynamic.a aVar) {
    }

    @Override // H4.B0
    public final void y1(com.google.android.gms.dynamic.a aVar, String str) {
    }
}
