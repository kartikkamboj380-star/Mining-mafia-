package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W2 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f37148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37149b = "com.android.vending.billing.IInAppBillingService";

    protected W2(IBinder iBinder, String str) {
        this.f37148a = iBinder;
    }

    protected final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f37149b);
        return parcelObtain;
    }

    protected final void N0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f37148a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37148a;
    }

    protected final Parcel h0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f37148a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    protected final void t1(int i10, Parcel parcel) {
        try {
            this.f37148a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
