package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.C1730Fm;
import com.google.android.gms.internal.ads.InterfaceC2093Mm;
import com.google.android.gms.internal.ads.InterfaceC5666wo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: H4.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0652y0 extends AbstractC3885ie implements B0 {
    C0652y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // H4.B0
    public final void F1(String str, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(null);
        AbstractC4135ke.e(parcelJ, aVar);
        N0(6, parcelJ);
    }

    @Override // H4.B0
    public final void L4(InterfaceC2093Mm interfaceC2093Mm) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2093Mm);
        N0(12, parcelJ);
    }

    @Override // H4.B0
    public final void M0(U1 u10) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, u10);
        N0(14, parcelJ);
    }

    @Override // H4.B0
    public final void S0(boolean z9) {
        Parcel parcelJ = J();
        int i10 = AbstractC4135ke.f30848b;
        parcelJ.writeInt(z9 ? 1 : 0);
        N0(17, parcelJ);
    }

    @Override // H4.B0
    public final void U(boolean z9) {
        Parcel parcelJ = J();
        int i10 = AbstractC4135ke.f30848b;
        parcelJ.writeInt(z9 ? 1 : 0);
        N0(4, parcelJ);
    }

    @Override // H4.B0
    public final List a() {
        Parcel parcelH0 = h0(13, J());
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(C1730Fm.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // H4.B0
    public final void b0(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(18, parcelJ);
    }

    @Override // H4.B0
    public final void b1(M0 m10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, m10);
        N0(16, parcelJ);
    }

    @Override // H4.B0
    public final void b6(InterfaceC5666wo interfaceC5666wo) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC5666wo);
        N0(11, parcelJ);
    }

    @Override // H4.B0
    public final String e() {
        Parcel parcelH0 = h0(9, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // H4.B0
    public final void f() {
        N0(15, J());
    }

    @Override // H4.B0
    public final void m0(float f10) {
        Parcel parcelJ = J();
        parcelJ.writeFloat(f10);
        N0(2, parcelJ);
    }

    @Override // H4.B0
    public final void o0(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(10, parcelJ);
    }

    @Override // H4.B0
    public final void p() {
        N0(19, J());
    }

    @Override // H4.B0
    public final void y1(com.google.android.gms.dynamic.a aVar, String str) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        parcelJ.writeString(str);
        N0(5, parcelJ);
    }

    @Override // H4.B0
    public final void zze() {
        N0(1, J());
    }
}
