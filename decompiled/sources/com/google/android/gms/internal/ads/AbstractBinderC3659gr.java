package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3659gr extends AbstractBinderC4009je implements InterfaceC3785hr {
    public AbstractBinderC3659gr() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4287lr c4035jr = null;
        C4413mr c4413mr = null;
        InterfaceC4287lr c4035jr2 = null;
        InterfaceC4287lr c4035jr3 = null;
        InterfaceC4287lr c4035jr4 = null;
        switch (i10) {
            case 1:
                AbstractC4135ke.h(parcel);
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC3910ir) {
                    }
                }
                AbstractC4135ke.h(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C5420ur c5420ur = (C5420ur) AbstractC4135ke.b(parcel, C5420ur.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c4035jr = iInterfaceQueryLocalInterface2 instanceof InterfaceC4287lr ? (InterfaceC4287lr) iInterfaceQueryLocalInterface2 : new C4035jr(strongBinder2);
                }
                AbstractC4135ke.h(parcel);
                X0(c5420ur, c4035jr);
                parcel2.writeNoException();
                return true;
            case 5:
                C5420ur c5420ur2 = (C5420ur) AbstractC4135ke.b(parcel, C5420ur.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c4035jr4 = iInterfaceQueryLocalInterface3 instanceof InterfaceC4287lr ? (InterfaceC4287lr) iInterfaceQueryLocalInterface3 : new C4035jr(strongBinder3);
                }
                AbstractC4135ke.h(parcel);
                b2(c5420ur2, c4035jr4);
                parcel2.writeNoException();
                return true;
            case 6:
                C5420ur c5420ur3 = (C5420ur) AbstractC4135ke.b(parcel, C5420ur.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c4035jr3 = iInterfaceQueryLocalInterface4 instanceof InterfaceC4287lr ? (InterfaceC4287lr) iInterfaceQueryLocalInterface4 : new C4035jr(strongBinder4);
                }
                AbstractC4135ke.h(parcel);
                K1(c5420ur3, c4035jr3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c4035jr2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC4287lr ? (InterfaceC4287lr) iInterfaceQueryLocalInterface5 : new C4035jr(strongBinder5);
                }
                AbstractC4135ke.h(parcel);
                G3(string, c4035jr2);
                parcel2.writeNoException();
                return true;
            case 8:
                C3281dr c3281dr = (C3281dr) AbstractC4135ke.b(parcel, C3281dr.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c4413mr = iInterfaceQueryLocalInterface6 instanceof C4413mr ? (C4413mr) iInterfaceQueryLocalInterface6 : new C4413mr(strongBinder6);
                }
                AbstractC4135ke.h(parcel);
                h4(c3281dr, c4413mr);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                AbstractC4135ke.h(parcel);
                M(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
