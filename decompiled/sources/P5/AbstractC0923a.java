package P5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: P5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0923a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f4685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4686b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected AbstractC0923a(IBinder iBinder, String str) {
        this.f4685a = iBinder;
    }

    protected final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f4686b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4685a;
    }

    protected final void h0(int i10, Parcel parcel) {
        try {
            this.f4685a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
