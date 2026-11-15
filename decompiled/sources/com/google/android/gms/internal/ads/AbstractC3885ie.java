package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3885ie implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f29480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29481b;

    protected AbstractC3885ie(IBinder iBinder, String str) {
        this.f29480a = iBinder;
        this.f29481b = str;
    }

    protected final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f29481b);
        return parcelObtain;
    }

    protected final void N0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f29480a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29480a;
    }

    protected final Parcel h0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f29480a.transact(i10, parcel, parcelObtain, 0);
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
            this.f29480a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
