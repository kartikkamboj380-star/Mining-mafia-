package V5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: V5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0964a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f6098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6099b;

    protected AbstractC0964a(IBinder iBinder, String str) {
        this.f6098a = iBinder;
        this.f6099b = str;
    }

    protected final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6099b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6098a;
    }

    protected final void h0(int i10, Parcel parcel) {
        try {
            this.f6098a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
