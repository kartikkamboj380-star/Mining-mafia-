package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f36413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36414b;

    protected N(IBinder iBinder, String str) {
        this.f36413a = iBinder;
        this.f36414b = str;
    }

    protected final Parcel J(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f36413a.transact(i10, parcel, parcelObtain, 0);
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

    protected final void N0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f36413a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36413a;
    }

    protected final Parcel h0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f36414b);
        return parcelObtain;
    }

    protected final void t1(int i10, Parcel parcel) {
        try {
            this.f36413a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
