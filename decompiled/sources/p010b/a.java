package p010b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f11482q = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    Bundle M1(String str, Bundle bundle);

    void O2(String str, Bundle bundle);

    void P5(int i10, Bundle bundle);

    void X4(Bundle bundle);

    void a3(Bundle bundle);

    void d5(Bundle bundle);

    void f6(String str, Bundle bundle);

    void k1(int i10, int i11, int i12, int i13, int i14, Bundle bundle);

    void k6(Bundle bundle);

    void l5(int i10, int i11, Bundle bundle);

    void n6(int i10, Uri uri, boolean z9, Bundle bundle);

    /* JADX INFO: renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0188a extends Binder implements a {
        public AbstractBinderC0188a() {
            attachInterface(this, a.f11482q);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f11482q;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    P5(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    O2(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    k6((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    f6(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    n6(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleM1 = M1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleM1, 1);
                    return true;
                case 8:
                    l5(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    a3((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    k1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    X4((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    d5((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
